import {useState} from "react";
import {SortUrl} from "./SortUrl";
import {Header} from "./Header";
import {InputForm} from "./InputForm";
import "../style/Card.css";
export function Form(){
	const [url,setUrl] = useState("");
	function handler(e){
		e.preventDefault();
		const form = e.target;
		const formData = new FormData(form);
		const formJson = Object.fromEntries(formData.entries());
		const urlData = formJson.urlInput;
		fetch("http://localhost:9000/sort",
			{method:"POST",headers:
			{"Content-Type":"application/json;charset=utf8"},body:JSON.stringify({data:urlData})}
		).then(res=>res.json())
		.then(json=>setUrl("http://localhost:3000/"+json.data));
	}
	return(
		<div className="container">
			<div className="card my-card">
				<div className="card-title">
					<Header />
				</div>
				<div className="card-body">
					<InputForm fn={handler} />
					<SortUrl url={url} />
				</div>
			</div>
		</div>
	);
}