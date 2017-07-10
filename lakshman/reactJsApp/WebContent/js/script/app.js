 	/**
	 * @jsx React.DOM
	 */
     var ExampleApp = React.createClass({
	 	// setting up initial state
		getInitialState:function(){
			return{
				data:[]
			};
		},
		componentDidMount(){
			this.getDataFromServer('data/data.json');
		},
		// showResult Method
			showResult: function(response) {

				this.setState({
					data: response
				});
		},
		// making ajax call to get data from server. here we have data in a file.
		getDataFromServer:function(URL){
			$.ajax({
				type:"GET",
				dataType:"json",
				url:URL,
				success: function(response) {
					this.showResult(response);
				}.bind(this),
				error: function(xhr, status, err) {
					console.error(this.props.url, status, err.toString());
				}.bind(this)
			});
		},
        render: function() {
         return(
             <Result result={this.state.data}/>
          );
        }
      });
     
	var Result = React.createClass({
	    render:function(){
	        var result = this.props.result.map(function(result,index){
	            	return <ResultItem key={index} user={ result } />
	            });
	        return(
	            <div>
	                <div>
	                    <table>
	                        <thead>
	                            <tr>
	                                <th>UserName</th>
	                                <th >Address</th>
	                                <th>Contact</th>
	                            </tr>
	                        </thead>
	                        <tbody>
	                            {result}
	                        </tbody>
	                    </table>
	                </div>
	            </div>
	        );
	    }
	});
	
	var ResultItem = React.createClass({
	    render:function(){
	        var camper = this.props.user;
	        return(
	            <tr >
	                <td>{camper.username}</td>
	                <td>{camper.address}</td>
	                <td>{camper.phone}</td>
	            </tr>
	        );
	    }
	});
	
	React.renderComponent(
	      <ExampleApp />,
	  document.getElementById('container')
	);