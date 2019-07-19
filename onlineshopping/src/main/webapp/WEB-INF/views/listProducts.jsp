<div class="container">

	<div class="row">

		<!-- would be to display side bar  -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display products -->
		<div class="col-md-9">



			<!-- added breadcrum component -->
			<div class="row">

				<div calss="col-lg-12">

					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrum">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All products</li>

						</ol>
					</c:if>
					
					
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrum">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>

						</ol>
					</c:if>
					
				</div>
			</div>


		</div>

	</div>



</div>
"









