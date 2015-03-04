package safiap.framework; class SafFrameworkManager$e { void a() { int a;
a=0;// .class final Lsafiap/framework/SafFrameworkManager$e;
a=0;// .super Lsafiap/framework/sdk/a/b;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/SafFrameworkManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "e"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final b:Ljava/lang/String; = "avp"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Lsafiap/framework/a/b;
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// .field private e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;// .field private f:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/sdk/ISAFFrameworkCallback;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private synthetic g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lsafiap/framework/SafFrameworkManager;Lsafiap/framework/a/b;Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     iput-object p1, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v0, p2, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0, v1}, Lsafiap/framework/sdk/a/b;-><init>(Ljava/lang/String;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 393
a=0;//     #p0=(Reference,Lsafiap/framework/SafFrameworkManager$e;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->c:Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 405
a=0;//     iput-object p2, p0, Lsafiap/framework/SafFrameworkManager$e;->c:Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 406
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lsafiap/framework/SafFrameworkManager$e;->d:Z
a=0;// 
a=0;//     .line 407
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "PluginQueryTask.onPostExecute().result: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 435
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 436
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 439
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v0, "["
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 440
a=0;//     #v0=(Integer);
a=0;//     new-instance v2, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 441
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 442
a=0;//     invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 443
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v3}, Lsafiap/framework/a/b;->a(Lorg/json/JSONObject;)Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 441
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 448
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 449
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 450
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 452
a=0;//     new-instance v2, Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     #v2=(UninitRef,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v4, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v4}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-boolean v5, p0, Lsafiap/framework/SafFrameworkManager$e;->d:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct {v2, v3, v4, v0, v5}, Lsafiap/framework/SafFrameworkManager$b;-><init>(Lsafiap/framework/SafFrameworkManager;Landroid/content/Context;Lsafiap/framework/a/b;Z)V
a=0;// 
a=0;//     .line 453
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     invoke-virtual {v2}, Lsafiap/framework/SafFrameworkManager$b;->a()Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, v3, Lsafiap/framework/a/b;->p:Z
a=0;// 
a=0;//     .line 454
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iput-object v2, v3, Lsafiap/framework/SafFrameworkManager$c;->d:Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v2}, Lsafiap/framework/SafFrameworkManager;->g(Lsafiap/framework/SafFrameworkManager;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 457
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 458
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "action_name"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 459
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->g(Lsafiap/framework/SafFrameworkManager;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 466
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 467
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "SAF-A Exception:530001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 468
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 485
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 473
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->e(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/b$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->c:Lsafiap/framework/a/b;
a=0;// 
a=0;//     iget-object v1, v1, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lsafiap/framework/b$a;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 477
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->d:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     .line 480
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v2, p0, Lsafiap/framework/SafFrameworkManager$e;->d:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v0, v1, v2}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     .line 482
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->f:Ljava/util/List;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/SafFrameworkManager$e;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 426
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->b:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$a;);
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     .line 429
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1}, Lsafiap/framework/sdk/a/b;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "PluginQueryTask.onPostExecute().result: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v0, "["
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-instance v2, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v3}, Lsafiap/framework/a/b;->a(Lorg/json/JSONObject;)Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lsafiap/framework/a/b;
a=0;// 
a=0;//     new-instance v2, Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     #v2=(UninitRef,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v4, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v4}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-boolean v5, p0, Lsafiap/framework/SafFrameworkManager$e;->d:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct {v2, v3, v4, v0, v5}, Lsafiap/framework/SafFrameworkManager$b;-><init>(Lsafiap/framework/SafFrameworkManager;Landroid/content/Context;Lsafiap/framework/a/b;Z)V
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     invoke-virtual {v2}, Lsafiap/framework/SafFrameworkManager$b;->a()Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, v3, Lsafiap/framework/a/b;->p:Z
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iput-object v2, v3, Lsafiap/framework/SafFrameworkManager$c;->d:Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v2}, Lsafiap/framework/SafFrameworkManager;->g(Lsafiap/framework/SafFrameworkManager;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "action_name"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->g(Lsafiap/framework/SafFrameworkManager;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "SAF-A Exception:530001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->e(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/b$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->c:Lsafiap/framework/a/b;
a=0;// 
a=0;//     iget-object v1, v1, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lsafiap/framework/b$a;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->d:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v2, p0, Lsafiap/framework/SafFrameworkManager$e;->d:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v0, v1, v2}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->f:Ljava/util/List;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected final onPreExecute()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 411
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->e:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->e:Ljava/util/List;
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->f:Ljava/util/List;
a=0;// 
a=0;//     .line 417
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$e;->g:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$e;->c:Lsafiap/framework/a/b;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/a/b;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 418
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "PluginQueryTask.onPreExecute().json: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 419
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 420
a=0;//     const-string v1, "avp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0}, Lsafiap/framework/SafFrameworkManager$e;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 422
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 417
a=0;//     :cond_2
a=0;//     #v1=(Reference,Landroid/content/Context;);v3=(Uninit);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v0, 0x7b
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v0, v2, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/16 v0, 0x3a
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "["
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v0, v2, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, ","
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v0, v2, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {v1, v0, v2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "[]"
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "]"
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/16 v0, 0x7d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Reference,Lsafiap/framework/a/b;);
a=0;//     iget v0, v2, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
