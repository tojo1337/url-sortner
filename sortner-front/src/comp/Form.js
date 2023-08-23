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
		console.log(urlData);
		setUrl(urlData);
	}
	return(
		<div class="container">
			<form method="post" onSubmit={handler}>
				<div class="row">
					<div class="col">
						<input type="text" name="urlInput" class="form-control" id="urlInput" aria-describedby="urlInput" placeholder="Enter url" />
					</div>
					<div class="col">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>
			</form>
			<div class="form-group">
				<SortUrl url={url}/>
			</div>
		</div>
	);
}