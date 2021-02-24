package hhh.hestagram.Content;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@RequiredArgsConstructor
@Service
//@Transactional
public class ContentServiceImpl implements ContentService {

    private final ContentRepository contentRepository;

    ContentSaveRequestDto contentSaveRequestDto = new ContentSaveRequestDto();

    @Autowired
    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Long saveContent(ContentSaveRequestDto requestDto) {
        return ContentRepository.save(requestDto.toEntity()).getContentIndex();
    }

    @Override
    public Content deleteByContentId(Long contentId) {
        return null;
    }

    @Override
    public Content updateByContentId(Long contentId) {
        return null;
    }

    @Override
    public List<Content> findByUserId(Long userId) {
        return null;
    }

    @Override
    public Long updateLikeCount(Long contentId) {
        return null;
    }
}
