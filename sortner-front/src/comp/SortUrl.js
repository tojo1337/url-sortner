export function SortUrl(props){
	return(
		<div className="container">
			<div className="row">
				<div className="col-sm">
					<div className="form-group">
						<input className="form-control" type="text" placeholder={props.url} readOnly />
					</div>
				</div>
			</div>
		</div>
	);
}