package net.slidingmenu.tools.b.a.g.e; class h { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/a/g/e/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Lorg/json/JSONObject;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/g/e/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/h;);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput p3, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->d:I
a=0;// 
a=0;//     invoke-direct {p0, p2, p3}, Lnet/slidingmenu/tools/b/a/g/e/h;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/g/e/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/g/e/i;);
a=0;//     invoke-direct {v0, p0, p2, p1}, Lnet/slidingmenu/tools/b/a/g/e/i;-><init>(Lnet/slidingmenu/tools/b/a/g/e/h;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/i;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;I)V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/c/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lnet/slidingmenu/tools/b/c/c/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "ie"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "ei"
a=0;// 
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "si"
a=0;// 
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "bd"
a=0;// 
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "andid"
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "mac"
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "sv"
a=0;// 
a=0;//     const-string v2, "w%s,s%s"
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "500"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "500"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "lv"
a=0;// 
a=0;//     const-string v2, "2014120501"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "aat"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "pns"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Lnet/slidingmenu/tools/b/c/c/b;);v2=(Reference,Lorg/json/JSONObject;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "0"
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private b()Ljava/util/HashMap;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "rt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v0, Ljava/util/TreeMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/TreeMap;);
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/e/h;->b()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/TreeMap;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Reference,Ujava/lang/Object;);v2=(Reference,Ljava/lang/StringBuilder;);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(One);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(PosByte);v6=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/v1/android/packages"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/e/h;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->c:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/l;->a([B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/b/a/g/e/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/b/b/d/k;->a([B[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/g;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v3, 0x200
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/c;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v3, "?rt="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v3, "&sign="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/b/b/i/a/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/b/b/i/a/b;);
a=0;//     invoke-direct {v2}, Lnet/slidingmenu/tools/b/b/i/a/b;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/b/i/a/b;);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v7, :cond_3
a=0;// 
a=0;//     const-string v3, "a_sdk_prt_i"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/b/b/i/a/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/c/b;->a()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/b/b/i/a/b;->a(I)V
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Lorg/apache/http/Header;
a=0;// 
a=0;//     #v3=(Reference,[Lorg/apache/http/Header;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "X-YM-APP"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v6}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0, v5, v6}, Lnet/slidingmenu/tools/b/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "Content-Type"
a=0;// 
a=0;//     const-string v6, "application/octet-stream"
a=0;// 
a=0;//     invoke-direct {p0, v5, v6}, Lnet/slidingmenu/tools/b/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const-string v5, "X-YM-SESSION"
a=0;// 
a=0;//     iget-object v6, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v6}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0, v5, v6}, Lnet/slidingmenu/tools/b/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     const-string v5, "X-YM-SESSION"
a=0;// 
a=0;//     iget-object v6, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v6}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0, v5, v6}, Lnet/slidingmenu/tools/b/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     const-string v5, "X-YM-Encoding"
a=0;// 
a=0;//     const-string v6, "deflate,enc4"
a=0;// 
a=0;//     invoke-direct {p0, v5, v6}, Lnet/slidingmenu/tools/b/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4, v0, v1, v3, v2}, Lnet/slidingmenu/tools/b/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;[B[Lorg/apache/http/Header;Lnet/slidingmenu/tools/b/b/i/a/b;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "c"
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v1, v0, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v7, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/g/e/c;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,[B);v2=(Reference,Lnet/slidingmenu/tools/b/b/i/a/b;);v3=(Integer);v4=(Reference,Ljava/lang/String;);v5=(PosByte);v6=(Uninit);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/b/a/g/e/h;->d:I
a=0;// 
a=0;//     if-ne v3, v5, :cond_2
a=0;// 
a=0;//     const-string v3, "a_sdk_prt_u"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/b/b/i/a/b;->b(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
