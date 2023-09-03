import {AiOutlineEnter} from "react-icons/ai"
export function InputForm(props){
	return(
		<div className="container">
			<div className="row">
				<form method="post" onSubmit={props.fn}>
					<div className="col-sm-5">
						<input type="text" name="urlInput" className="form-control" id="urlInput" aria-describedby="urlInput" placeholder="Enter url" />
					</div>
					<div className="col-sm">
						<button type="submit" className="btn btn-primary">
							<AiOutlineEnter />
						</button>
					</div>
				</form>
			</div>
		</div>
	);
}