package com.magazine.rest;


@Controller
@RequestMapping("/customer")
public class ManagerRestServiceImpl {
	
	@Autowire
	private ManagerService managerService;
	
	@RequestMapping(value="/modifyArticles", method = RequestMethod.POST)
	public @ResponseBody Article modifyArticles(@PathVariable Article article) throws Exception{
		try{
			managerService.modifyArticles(article);
		}catch(Exception e){
			throw new Exception("Internally error occured");
		}
		return article;
	}
	
	@RequestMapping(value="/createCommentAndReview", method = RequestMethod.POST)
	public @ResponseBody CommentAndReview createCommentAndReview(@PathVariable CommentAndReview commentAndReview) throws Exception{
		try{
			managerService.createCommentAndReview(commentAndReview);			
		}catch(Exception e){
			throw new Exception("Internally error occured");
		}
		return commentAndReview;
	}
}
