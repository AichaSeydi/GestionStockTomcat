<jsp:include page="../header.jsp"></jsp:include>
<!-- Content Row -->

<div class="row">

    <!-- Area Chart -->
    <div class="col-xl-8 col-lg-7">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">Liste des produits</h6>
            </div>
            <!-- Card Body -->
            <div class="card-body">
            </div>
        </div>
    </div>

    <!-- Pie Chart -->
    <div class="col-xl-4 col-lg-5">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">Ajout de produits</h6>
                <div class="dropdown no-arrow">
                    <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                    </a>
                </div>
            </div>
            <!-- Card Body -->
            <div class="card-body">
                <div id="message" class="alert alert-success">Produit ajoute avec success</div>
                <form method="post" action="Produit" >
                      <div class="form-group">
                          <label>Nom du produit</label>
                          <input class="form-control" type="text" name="nom"/>
                      </div>
                      <div class="form-group">
                        <label>Quantite en stock du produit</label>
                        <input class="form-control" type="text" name="qtStock"/>
                      </div>
                      <div class="form-group">
                        <input class="btn btn-success" type="submit" value="Envoyer"/>
                      </div>
                  </form>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../footer.jsp"></jsp:include>