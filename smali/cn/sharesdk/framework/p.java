package cn.sharesdk.framework; class p { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/p;
a=0;// .super Lcn/sharesdk/framework/l;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/sharesdk/framework/p$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private e:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private f:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Lcn/sharesdk/framework/CustomPlatform;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private g:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private h:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Lcn/sharesdk/framework/Service;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private i:Ljava/lang/String;
a=0;// 
a=0;// .field private j:Z
a=0;// 
a=0;// .field private k:Ljava/lang/String;
a=0;// 
a=0;// .field private l:Z
a=0;// 
a=0;// .field private m:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Thread-"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, -0x248a
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/l;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/p;);
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->a:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/utils/UIHandler;->prepare()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/framework/p;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcn/sharesdk/framework/statistics/a;Ljava/util/HashMap;Ljava/util/HashMap;)Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcn/sharesdk/framework/statistics/a;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     const-string v2, "error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v2, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v2}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v2, p2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v2, "res"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v2, "SNS configuration is empty"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v2, "res"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v3, v2}, Lcn/sharesdk/framework/statistics/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "snsconf returns ===> %s"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v2, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v3, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v3}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v3, v2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private i()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/p;->j()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "ShareSDK"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ShareSDK"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "AppKey"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v1, "UseVersion"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const-string v1, "UseVersion"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->k:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/HashMap;);v1=(Boolean);
a=0;//     const-string v0, "latest"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private j()V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(One);
a=0;//     invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/xmlpull/v1/XmlPullParserFactory;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "ShareSDK.xml"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     const-string v0, "utf-8"
a=0;// 
a=0;//     invoke-interface {v2, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eq v0, v8, :cond_2
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     if-ge v0, v5, :cond_0
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v4, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "ShareSDK.conf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/util/HashMap;);v5=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private k()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/n;->a(Landroid/content/Context;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private l()V
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/p;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     iget-boolean v4, p0, Lcn/sharesdk/framework/p;->j:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/p;->e()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/n;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;ZI)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, p2, v1}, Lcn/sharesdk/framework/n;->a(ILjava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->c:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcn/sharesdk/framework/n;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;ZILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->c:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v4, p2
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcn/sharesdk/framework/n;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a()V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/p;->i()V
a=0;// 
a=0;//     invoke-super {p0}, Lcn/sharesdk/framework/l;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput p1, Lcn/sharesdk/framework/network/h;->a:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(II)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, p2, v1}, Lcn/sharesdk/framework/n;->a(IILjava/util/HashMap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(ILcn/sharesdk/framework/Platform;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/n;->a(ILcn/sharesdk/framework/Platform;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/p;->k()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/p;->l()V
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->c:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->notify()V
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/Class;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcn/sharesdk/framework/Service;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/Service;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/sharesdk/framework/Service;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/sharesdk/framework/Service;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Service;->onBind()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/n;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/HashMap;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
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
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/HashMap;);v4=(Reference,Ljava/util/Iterator;);
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v3
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcn/sharesdk/framework/p;->j:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/HashMap;)Z
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->c:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     if-eq v0, v2, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v2, "Statistics module unopened"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcn/sharesdk/framework/q;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);v1=(Null);v2=(Reference,Lcn/sharesdk/framework/p$a;);v3=(One);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcn/sharesdk/framework/statistics/a;->d(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v2, v0, p1}, Lcn/sharesdk/framework/p;->a(Lcn/sharesdk/framework/statistics/a;Ljava/util/HashMap;Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iput-boolean v3, p0, Lcn/sharesdk/framework/p;->m:Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/q;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/q;);
a=0;//     invoke-direct {v1, p0, v2}, Lcn/sharesdk/framework/q;-><init>(Lcn/sharesdk/framework/p;Lcn/sharesdk/framework/statistics/a;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/q;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/q;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcn/sharesdk/framework/statistics/a;->e(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/p;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v3}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v4, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v4}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v4, v3}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, p1}, Lcn/sharesdk/framework/p;->a(Lcn/sharesdk/framework/statistics/a;Ljava/util/HashMap;Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcn/sharesdk/framework/p;->m:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     :cond_3
a=0;//     iput-boolean v1, p0, Lcn/sharesdk/framework/p;->m:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/p;->c()[Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Lcn/sharesdk/framework/Platform;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Integer);v5=(Conflicted);
a=0;//     if-ge v2, v4, :cond_0
a=0;// 
a=0;//     aget-object v1, v3, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->d:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public b(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput p1, Lcn/sharesdk/framework/network/h;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/Service;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Service;->onUnbind()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/Iterator;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     :try_start_3
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/n;->b(Landroid/content/Context;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     :catchall_1
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Looper;->quit()V
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->a:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/Class;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcn/sharesdk/framework/Service;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/Service;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Service;->onUnbind()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcn/sharesdk/framework/p;->l:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/util/HashMap;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, v1}, Lcn/sharesdk/framework/n;->a(Ljava/util/HashMap;Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/sharesdk/framework/p;->b(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/Class;)Lcn/sharesdk/framework/Service;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Lcn/sharesdk/framework/Service;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/Service;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     monitor-exit v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " has not registered"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public c(I)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/p;->c()[Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Lcn/sharesdk/framework/Platform;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v4}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, p1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v4}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected c(Landroid/os/Message;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->a:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Looper;->quit()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public c()[Lcn/sharesdk/framework/Platform;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     sget-object v6, Lcn/sharesdk/framework/p$a;->a:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v6=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     monitor-exit v3
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,[Ljava/lang/Object;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);v4=(LongLo);v6=(Reference,Lcn/sharesdk/framework/p$a;);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     sget-object v6, Lcn/sharesdk/framework/p$a;->b:Lcn/sharesdk/framework/p$a;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     if-ne v0, v6, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->wait()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->b()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->a()V
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v6=(Reference,Ljava/util/ArrayList;);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->b()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v7=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_6
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     new-array v3, v0, [Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Integer);
a=0;//     array-length v0, v3
a=0;// 
a=0;//     if-ge v1, v0, :cond_7
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     aput-object v0, v3, v1
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     const-string v0, "sort list use time: %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long v4, v6, v4
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public d()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/n;->a()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const-string v0, "2.4.1"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public d(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/p$a;->c:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->b:Lcn/sharesdk/framework/p$a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/p$a;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcn/sharesdk/framework/n;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public d(Ljava/lang/Class;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcn/sharesdk/framework/CustomPlatform;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/Integer;);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-class v3, Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v0, v2
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/p;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/CustomPlatform;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public e()I
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcn/sharesdk/framework/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/n;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/n;->b()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/16 v0, 0x27
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public e(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcn/sharesdk/framework/CustomPlatform;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/p;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public f()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/p;->l:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public g()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/p;->j:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public h()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/p;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/p;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
