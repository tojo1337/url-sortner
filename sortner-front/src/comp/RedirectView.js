import {useParams} from "react-router-dom";
export function RedirectView(){
	const data = useParams();
	fetch("http://localhost:9000/data",
			{method:"POST",headers:
			{"Content-Type":"application/json;charset=utf8"},body:JSON.stringify({data:data.surl})}
		).then(res=>res.json())
		.then(json=>window.location=json.data);
}