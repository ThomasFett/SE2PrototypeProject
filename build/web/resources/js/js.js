/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

jQuery(function() {
    $('.createComment').click(function() {
        $($(this).parent().parent().find('.createCommentForm')).toggle();
        var id = $($(this).parent().parent().find('.createCommentForm').find('.ideaId')).val();
        $($(this).parent().parent().find('.createCommentForm').find('select')).val(id);
        return false;
    });
    
    $()
    
})


