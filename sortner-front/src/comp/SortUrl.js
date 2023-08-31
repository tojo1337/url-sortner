export function SortUrl(props){
	return(
		<div className="row">
			<div className="col">
				<div className="form-group">
					<input className="form-control" type="text" placeholder={props.url} readOnly />
				</div>
			</div>
		</div>
	);
}