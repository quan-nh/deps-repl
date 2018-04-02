
## Call the -main function
### Clj
```sh
$ clj -m foo.other-bar a b c
hello a
```

## Cljs with node.js modules
```sh
$ npm install
$ clj -A:cljs -m foo.baz foo 5
"  foo"
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

## REPL Friendly Mode
With `rebel-readline` & `expound`
```clj
$ clj -A:friendly
[Rebel readline] Type :repl/help for online help info
user=> (require '[expound.alpha :as expound])
nil
user=> (expound/expound string? 1)
nil
-- Spec failed --------------------

  1

should satisfy

  string?



-------------------------
Detected 1 error
user=>
```
