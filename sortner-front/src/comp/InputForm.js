import {AiOutlineEnter} from "react-icons/ai"
import "../style/InputForm.css";
export function InputForm(props){
	return(
		<div className="container">
			<form method="post" onSubmit={props.fn}>
				<table className="table table-borderless">
					<tbody>
						<tr>
							<td>
								<div className="input-group">
									<input type="text" name="urlInput" className="form-control" id="urlInput" aria-describedby="urlInput" placeholder="Enter url" />
								</div>
							</td>
							<td>
								<div className="input-group">
									<button type="submit" className="btn btn-primary">
										<AiOutlineEnter />
									</button>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	);
}