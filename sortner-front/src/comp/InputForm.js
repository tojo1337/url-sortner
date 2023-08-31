import {AiOutlineEnter} from "react-icons/ai"
export function InputForm(props){
	return(
		<form method="post" onSubmit={props.fn}>
			<div className="row">
				<div className="col">
					<input type="text" name="urlInput" className="form-control" id="urlInput" aria-describedby="urlInput" placeholder="Enter url" />
				</div>
				<div className="col">
					<button type="submit" className="btn btn-primary">
						<AiOutlineEnter />
					</button>
				</div>
			</div>
		</form>
	);
}