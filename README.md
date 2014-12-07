blaber
==========
A talkative Clojure library for embedding the Olark chat widget.

### Install
----------
Add the following entry to the `:dependencies` vector of your `project.clj` file:
[![clojars version](https://clojars.org/blaber/latest-version.svg?raw=true)]
(https://clojars.org/blaber)

### Enough talk! Show me some code!!1
----------
Olark.com says:
> Copy & paste this code above the last </body> tag on your site. Need Help?
For all you speed-demons out there, this code is already fully asynchronous and will NOT hurt the load time for your page.
```clojure
(ns app.some-view
  (:require [hiccup.page :refer [html5]]
            [bla.ber :refer [olark]]))

(defn layout []
  (html5
    [:head (olark "2595-305-39-3629")]
    [:body ...]))
```

### Blabing a lot? Add yourself to this list
----------
[kanasubs.com](http://www.kanasubs.com) — Convert raw subtitles in Kanji to
Kana or Romaji online.

### This one is also talkative
----------
Copyright (C) 2014 Carlos C. Fontes.

Licensed under the
[Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).