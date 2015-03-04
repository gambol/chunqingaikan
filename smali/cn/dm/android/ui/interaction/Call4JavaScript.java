package cn.dm.android.ui.interaction; class Call4JavaScript { void a() { int a;
a=0;// .class public Lcn/dm/android/ui/interaction/Call4JavaScript;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/android/ui/interaction/Call4JavaScript$a;,
a=0;//         Lcn/dm/android/ui/interaction/Call4JavaScript$b;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/dm/android/f/e;
a=0;// 
a=0;// .field private b:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcn/dm/a/a/a;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private c:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcn/dm/a/a/a;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Lcn/dm/android/g/b;
a=0;// 
a=0;// .field private f:Landroid/content/Context;
a=0;// 
a=0;// .field private g:Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/dm/android/g/b;)V
a=0;//     .locals 2
a=0;//     .param p1, "webView"    # Lcn/dm/android/g/b;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript;);
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/ui/interaction/Call4JavaScript;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->e:Lcn/dm/android/g/b;
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {p1}, Lcn/dm/android/g/b;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Lcn/dm/android/ui/interaction/Call4JavaScript;->a()V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/ui/interaction/Call4JavaScript;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a;->f()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->b:Ljava/util/List;
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v0, Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/OfferWallExecutor;);
a=0;//     invoke-direct {v0}, Lcn/dm/android/OfferWallExecutor;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/OfferWallExecutor;);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->g:Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a;->e()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->c:Ljava/util/Map;
a=0;// 
a=0;//     .line 81
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/dm/a/a/a;
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/dm/android/ui/interaction/Call4JavaScript;)Lcn/dm/android/f/e;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcn/dm/android/ui/interaction/Call4JavaScript;)Lcn/dm/android/g/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->e:Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkNativeApp(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:checkNativeApp "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 263
a=0;//     const-string v0, "packname"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 265
a=0;//     const-string v0, "callback"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/dm/a/a/a;
a=0;// 
a=0;//     .line 268
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->e:Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/b;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "({exist:false})"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcn/dm/android/g/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 274
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->e:Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/b;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "({exist:true})"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcn/dm/android/g/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 278
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->e:Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/b;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "({exist:false})"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/g/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 279
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "data"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "js call:close"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 247
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public doAction(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:doAction"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     const-string v0, "tr"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 234
a=0;//     const-string v0, "text"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 235
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "executable"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 236
a=0;//     #v4=(Boolean);
a=0;//     const-string v0, "action_url"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->g:Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/dm/android/OfferWallExecutor;->doAction(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
a=0;// 
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fetchConfig(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:fetchConfig"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     const-string v0, "callback"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcn/dm/android/ui/interaction/Call4JavaScript$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     sget-object v3, Lcn/dm/android/ui/interaction/Call4JavaScript$b;->a:Lcn/dm/android/ui/interaction/Call4JavaScript$b;
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$b;);
a=0;//     invoke-direct {v2, p0, v0, v3}, Lcn/dm/android/ui/interaction/Call4JavaScript$a;-><init>(Lcn/dm/android/ui/interaction/Call4JavaScript;Ljava/lang/String;Lcn/dm/android/ui/interaction/Call4JavaScript$b;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     invoke-virtual {v1, v2}, Lcn/dm/android/a/a;->a(Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fetchDetail(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:fetchDetail"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 167
a=0;//     const-string v0, "callback"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->d:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Lcn/dm/android/ui/interaction/Call4JavaScript$a;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     sget-object v4, Lcn/dm/android/ui/interaction/Call4JavaScript$b;->e:Lcn/dm/android/ui/interaction/Call4JavaScript$b;
a=0;// 
a=0;//     #v4=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$b;);
a=0;//     invoke-direct {v3, p0, v0, v4}, Lcn/dm/android/ui/interaction/Call4JavaScript$a;-><init>(Lcn/dm/android/ui/interaction/Call4JavaScript;Ljava/lang/String;Lcn/dm/android/ui/interaction/Call4JavaScript$b;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcn/dm/android/a/a;->c(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 170
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fetchPoints(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:fetchPoints"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     const-string v0, "callback"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcn/dm/android/ui/interaction/Call4JavaScript$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     sget-object v3, Lcn/dm/android/ui/interaction/Call4JavaScript$b;->e:Lcn/dm/android/ui/interaction/Call4JavaScript$b;
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$b;);
a=0;//     invoke-direct {v2, p0, v0, v3}, Lcn/dm/android/ui/interaction/Call4JavaScript$a;-><init>(Lcn/dm/android/ui/interaction/Call4JavaScript;Ljava/lang/String;Lcn/dm/android/ui/interaction/Call4JavaScript$b;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     invoke-virtual {v1, v2}, Lcn/dm/android/a/a;->b(Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fetchSignList(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:fetchSignList"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 126
a=0;//     const-string v0, "callback"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     const-string v1, "ids"
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcn/dm/android/ui/interaction/Call4JavaScript$a;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     sget-object v4, Lcn/dm/android/ui/interaction/Call4JavaScript$b;->c:Lcn/dm/android/ui/interaction/Call4JavaScript$b;
a=0;// 
a=0;//     #v4=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$b;);
a=0;//     invoke-direct {v3, p0, v0, v4}, Lcn/dm/android/ui/interaction/Call4JavaScript$a;-><init>(Lcn/dm/android/ui/interaction/Call4JavaScript;Ljava/lang/String;Lcn/dm/android/ui/interaction/Call4JavaScript$b;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     invoke-virtual {v2, v1, v3}, Lcn/dm/android/a/a;->b(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fetchTaskList(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:fetchTaskList"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     const-string v0, "ids"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     const-string v1, "callback"
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcn/dm/android/ui/interaction/Call4JavaScript$a;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     sget-object v4, Lcn/dm/android/ui/interaction/Call4JavaScript$b;->b:Lcn/dm/android/ui/interaction/Call4JavaScript$b;
a=0;// 
a=0;//     #v4=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$b;);
a=0;//     invoke-direct {v3, p0, v1, v4}, Lcn/dm/android/ui/interaction/Call4JavaScript$a;-><init>(Lcn/dm/android/ui/interaction/Call4JavaScript;Ljava/lang/String;Lcn/dm/android/ui/interaction/Call4JavaScript$b;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript$a;);
a=0;//     invoke-virtual {v2, v0, v3}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getSDKVersion(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     const-string v0, "callback"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 180
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "2.2.3"
a=0;// 
a=0;//     .line 183
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 184
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "version"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 188
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->e:Lcn/dm/android/g/b;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "("
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcn/dm/android/g/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 191
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 185
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 186
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getScreenInfo(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:fetchPoints"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 201
a=0;//     const-string v0, "callback"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/f/a;->n(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 203
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/f/a;->o(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 206
a=0;//     :try_start_0
a=0;//     #v3=(Integer);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 207
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "srceenWidth"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 208
a=0;//     const-string v2, "screenHeight"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 212
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->e:Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/g/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "("
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcn/dm/android/g/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 209
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 210
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public goDetail(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:goDetail"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 226
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcn/dm/android/DMOfferActivity;->start_detail(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openHelp(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "data"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "js call:openHelp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 257
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/DMOfferActivity;->start_help(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 258
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public report(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:report"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 155
a=0;//     const-string v1, "tr"
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcn/dm/android/f/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setId(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "id"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iput-object p1, p0, Lcn/dm/android/ui/interaction/Call4JavaScript;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
}}
