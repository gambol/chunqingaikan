package net.slidingmenu.tools.b.b.i.a; class a { void a() { int a;
a=0;// .class public abstract Lnet/slidingmenu/tools/b/b/i/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Lorg/json/JSONObject;
a=0;// 
a=0;// .field protected b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/b/i/c;Lnet/slidingmenu/tools/b/b/i/b;Lnet/slidingmenu/tools/b/b/i/a;Lnet/slidingmenu/tools/b/b/i/a/b;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/i/a/a;);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "rt"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "code"
a=0;// 
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->a()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "ert"
a=0;// 
a=0;//     invoke-virtual {p4}, Lnet/slidingmenu/tools/b/b/i/a;->a()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "sv"
a=0;// 
a=0;//     invoke-virtual {p5}, Lnet/slidingmenu/tools/b/b/i/a/b;->a()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "apn"
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "rhost"
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/i/c;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "rpath"
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/i/c;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "rquery"
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/i/c;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "response"
a=0;// 
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->e()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "process"
a=0;// 
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->d()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "caller"
a=0;// 
a=0;//     const-string v3, "SDK"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "product"
a=0;// 
a=0;//     invoke-virtual {p5}, Lnet/slidingmenu/tools/b/b/i/a/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/i/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "-1"
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v3, "service-ip"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "pid"
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "tag"
a=0;// 
a=0;//     invoke-virtual {p5}, Lnet/slidingmenu/tools/b/b/i/a/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "sysv"
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "pm"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "req_type"
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/i/c;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "bl"
a=0;// 
a=0;//     invoke-virtual {p4}, Lnet/slidingmenu/tools/b/b/i/a;->d()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->b()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Lorg/apache/http/Header;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->b()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Lorg/apache/http/Header;);
a=0;//     aget-object v3, v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "req-header"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->g()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_4
a=0;// 
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->g()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Lorg/apache/http/Header;);
a=0;//     aget-object v3, v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "rsp-header"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "exception"
a=0;// 
a=0;//     invoke-virtual {p3}, Lnet/slidingmenu/tools/b/b/i/b;->c()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/i/c;->b()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/i/c;->k()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-lez v3, :cond_7
a=0;// 
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "post-data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Null);v1=(Reference,[B);v2=(Reference,Ljava/util/List;);v3=(Integer);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     array-length v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "post-data"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v1, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a/a;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/b/b/i/f;->a(Landroid/content/Context;Lorg/json/JSONObject;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
