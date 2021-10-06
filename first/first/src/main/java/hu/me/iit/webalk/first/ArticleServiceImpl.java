package hu.me.iit.webalk.first;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {
	
	private final int MAXIMUM_ARTICLE_COUNT = 10;
	private ArticleRepository articleRepository;

	@Override
	public List<ArticleDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long save(ArticleDto articleDto) {
		// TODO Auto-generated method stub
		if(articleRepository.findAll().size() > MAXIMUM_ARTICLE_COUNT) {
			throw new TooMuchArticleException();
		}
		return articleRepository.save(articleDto);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

}
