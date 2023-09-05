import {BiCopy} from "react-icons/bi";
export function SortUrl(props){
	return(
		<div className="container">
			<table className="table table-borderless">
				<tbody>
					<tr>
						<td>
							<input className="form-control" type="text" placeholder={props.url} readOnly />
						</td>
						<td>
							<button className="btn btn-primary">
								<BiCopy />
							</button>
						</td>
					</tr>
				</tbody>	
			</table>
		</div>
	);
}