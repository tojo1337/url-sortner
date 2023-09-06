import {BiCopy} from "react-icons/bi";
export function SortUrl(props){
	function copyHandler(){
		var data = document.getElementById("copyUrl").placeholder;
		console.log(data);
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