<%@ page pageEncoding="utf-8"%>


<button formaction="/category/create" ${empty category.id ? '' : 'disabled'} class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span> Create
</button>
<button formaction="/category/update" ${empty category.id ? 'disabled' : ''} class="btn btn-success">
    <span class="glyphicon glyphicon-save"></span> Update
</button>
<button formaction="/category/delete/${category.id}" ${empty category.id ? 'disabled' : ''} class="btn btn-danger">
    <span class="glyphicon glyphicon-trash"></span> Delete
</button>
<a href="/category/index" class="btn btn-info">
    <span class="glyphicon glyphicon-refresh"></span> Reset
</a>