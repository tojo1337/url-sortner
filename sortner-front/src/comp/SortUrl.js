import copy from "copy-to-clipboard";
import {BiCopy} from "react-icons/bi";
export function SortUrl(props){
	function copyHandler(e){
		e.preventDefault();
		var data = document.getElementById("copyUrl").placeholder;
		copy(data);
		console.log("Data has been copied");
		console.log("Data : "+data);
	}
	return(
		<div className="container">
			<table className="table table-borderless">
				<tbody>
					<tr>
						<td>
							<input className="form-control" id="copyUrl" type="text" placeholder={props.url} readOnly />
						</td>
						<td>
							<button className="btn btn-primary" onClick={copyHandler}>
								<BiCopy />
							</button>
						</td>
					</tr>
				</tbody>	
			</table>
		</div>
	);
}