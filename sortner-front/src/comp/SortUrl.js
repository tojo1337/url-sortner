export function SortUrl(props){
	return(
		<div className="form-group">
			<input className="form-control" type="text" placeholder={props.url} readOnly />
		</div>
	);
}