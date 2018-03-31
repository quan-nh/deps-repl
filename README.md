
## Call the -main function
```sh
$ clj -m foo.other-bar a b c
hello a
```

## REPL
```clj
$ clj
Clojure 1.9.0
user=> (load "foo/other_bar")
nil
user=> (in-ns 'foo.other-bar)
#object[clojure.lang.Namespace 0x4aa83f4f "foo.other-bar"]
foo.other-bar=> (-main :a :b :c)
hello :a
nil
foo.other-bar=>
```
