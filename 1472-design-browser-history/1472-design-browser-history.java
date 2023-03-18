class BrowserHistory {
    ArrayList<String> visitedURLs;
    int currURL, lastURL;

    public BrowserHistory(String homepage) {
        visitedURLs = new ArrayList<String>(Arrays.asList(homepage));
        currURL = 0; 
        lastURL = 0;
    }
    
    public void visit(String url) {
        currURL += 1;
        if (visitedURLs.size() > currURL) {
            visitedURLs.set(currURL, url);
        } else {
            visitedURLs.add(url);
        }
        lastURL = currURL;
    }
    
    public String back(int steps) {
        currURL = Math.max(0, currURL - steps);
        return visitedURLs.get(currURL);
    }
    
    public String forward(int steps) {
        currURL = Math.min(lastURL, currURL + steps);
        return visitedURLs.get(currURL);
    }
}