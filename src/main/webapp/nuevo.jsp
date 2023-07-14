<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="styles.jsp"></jsp:include>
</head>
<body>
    <jsp:include page="navbar.jsp"></jsp:include>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <section>
                    <h1>Alta Articulo</h1>
                    <!--<%=request.getContextPath()%> se convierte en el contexto
                    /web-app
                    -->
                    <form method="post" action="<%=request.getContextPath()%>/AltaProductoController">
                        <div class="mb-3">
                            <label for="exampleFormControlInput1" 
                                class="form-label">Nombre</label>
                            <input name="nombre" 
                                type="text" 
                                class="form-control" 
                                id="exampleFormControlInput1"
                                placeholder="Nombre"
                                maxlength="50">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlTextarea1" 
                                class="form-label">Precio
                            </label>
                            <input name="precio" 
                                type="number" 
                                class="form-control" 
                                id="exampleFormControlTextarea1">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlTextarea1" 
                                class="form-label">Imágen
                            </label>
                            <input name="imagen" 
                                type="file" 
                                class="form-control" 
                                id="exampleFormControlTextarea1">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlTextarea1" 
                                class="form-label">Código
                            </label>
                            <input name="codigo" 
                                type="text" 
                                class="form-control" 
                                id="exampleFormControlTextarea1" 
                                maxlength="7">
                        </div>
                        <div class="mb-3">
                            <label for="autor" 
                                class="form-label">Autor
                            </label>
                            <input name="autor" 
                                type="text" 
                                class="form-control" 
                                id="autor" 
                                maxlength="50">
                        </div>
                        <button class="btn btn-primary">
                            Dar de alta
                        </button>
                    </form>
                </section>
            </div>
        </div>
        <jsp:include page="scripts.jsp"></jsp:include>
</body>

</html>