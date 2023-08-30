import {useState} from "react";
import {SortUrl} from "./SortUrl.js";
export function Form(){
	const [url,setUrl] = useState("");
	function handler(e){
		e.preventDefault();
		const form = e.target;
		const formData = new FormData(form);
		const formJson = Object.fromEntries(formData.entries());
		const urlData = formJson.urlInput;
		fetch("http://localhost:9000/sort",{method:"POST",headers:{"Content-Type":"application/json;charset=utf8"},body:JSON.stringify({data:urlData
})}).then(res=>res.json()).then(json=>setUrl("http://localhost:3000/"+json.data));
	}
	return(
		<div className="container">
			<form method="post" onSubmit={handler}>
				<div className="row">
					<div className="col">
						<input type="text" name="urlInput" className="form-control" id="urlInput" aria-describedby="urlInput" placeholder="Enter url" />
					</div>
					<div className="col">
						<button type="submit" className="btn btn-primary">Submit</button>
					</div>
				</div>
			</form>
			<div className="row">
				<div className="col">
					<SortUrl url={url} />
				</div>
			</div>
		</div>
	);
}