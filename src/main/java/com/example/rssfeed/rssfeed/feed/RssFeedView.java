package com.example.rssfeed.rssfeed.feed;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Item;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class RssFeedView extends AbstractRssFeedView {

    @Override
    protected void buildFeedMetadata(Map<String, Object> model, Channel feed, HttpServletRequest request) {
        feed.setTitle("Leye's Feed");
        feed.setDescription("This feed provides the latest information concerning the application");
        feed.setLink("www.github.com/monsur4");
    }

    @Override
    protected List<Item> buildFeedItems(Map<String, Object> model,
                                        HttpServletRequest request,
                                        HttpServletResponse response) throws Exception {
        Item firstItem = new Item();
        firstItem.setTitle("This is the first title");
        firstItem.setComments("This is the first comment");
        Content content = new Content();
        content.setValue("This is the first Content");
        firstItem.setContent(content);
        firstItem.setAuthor("Monsuru is the Author");
        Description description = new Description();
        description.setValue("This is the first Description provided");
        firstItem.setDescription(description);
        firstItem.setLink("www.wikipedia.com");
        return List.of(firstItem);
    }
}
