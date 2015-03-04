package cn.sharesdk.framework; class d { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcn/sharesdk/framework/Platform;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "nickname"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-string v3, "icon"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v3, "gender"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     const-string v3, "snsUserUrl"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     const-string v3, "resume"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     const-string v3, "secretType"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     const-string v3, "secret"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     const-string v3, "birthday"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     const-string v3, "followerCount"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     const-string v3, "favouriteCount"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     const-string v3, "shareCount"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     const-string v3, "snsregat"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     const-string v3, "snsUserLevel"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     const-string v3, "educationJSONArrayStr"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     const-string v3, "workJSONArrayStr"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/PlatformDb;[Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcn/sharesdk/framework/PlatformDb;[Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/16 v8, 0x7c
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v5, p2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v5, :cond_2
a=0;// 
a=0;//     aget-object v6, p2, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {p1, v6}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v7, "utf-8"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "======UserData: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/Platform;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/Platform;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             "I",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/e;);
a=0;//     invoke-direct {v1, p0, v0, p2, p3}, Lcn/sharesdk/framework/e;-><init>(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;ILjava/util/HashMap;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/e;);
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/framework/Platform;->showUser(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcn/sharesdk/framework/Platform;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "gender"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-string v3, "birthday"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v3, "secretType"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     const-string v3, "educationJSONArrayStr"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     const-string v3, "workJSONArrayStr"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/PlatformDb;[Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             "I",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     const-string v0, "ShareParams"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/Platform$ShareParams;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Platform$ShareParams;);
a=0;//     invoke-virtual {p3}, Ljava/util/HashMap;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v2, p1, p2, p3}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     new-instance v3, Lcn/sharesdk/framework/statistics/b/f;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/sharesdk/framework/statistics/b/f;);
a=0;//     invoke-direct {v3}, Lcn/sharesdk/framework/statistics/b/f;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/statistics/b/f;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/Platform$ShareParams;->getCustomFlag()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v3, Lcn/sharesdk/framework/statistics/b/f;->o:[Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "TencentWeibo"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     const-string v4, "name"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_3
a=0;//     iput-object v2, v3, Lcn/sharesdk/framework/statistics/b/f;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v3, Lcn/sharesdk/framework/statistics/b/f;->a:I
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0}, Lcn/sharesdk/framework/Platform;->filterShareContent(Lcn/sharesdk/framework/Platform$ShareParams;Ljava/util/HashMap;)Lcn/sharesdk/framework/statistics/b/f$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, v0, Lcn/sharesdk/framework/statistics/b/f$a;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v3, Lcn/sharesdk/framework/statistics/b/f;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v3, Lcn/sharesdk/framework/statistics/b/f;->d:Lcn/sharesdk/framework/statistics/b/f$a;
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/d;->b(Lcn/sharesdk/framework/Platform;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v3, Lcn/sharesdk/framework/statistics/b/f;->n:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcn/sharesdk/framework/statistics/b;->a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v0, p3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     move-exception v2
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v3=(Reference,Lcn/sharesdk/framework/statistics/b/f;);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/PlatformDb;->getUserId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method a(Lcn/sharesdk/framework/Platform;ILjava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/f;);
a=0;//     invoke-direct {v1, p0, v0, p2, p3}, Lcn/sharesdk/framework/f;-><init>(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;ILjava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/f;);
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/framework/Platform;->doAuthorize([Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method a(Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Lcn/sharesdk/framework/PlatformActionListener;->onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             "I",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     instance-of v0, p1, Lcn/sharesdk/framework/CustomPlatform;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     sparse-switch p2, :sswitch_data_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_1
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcn/sharesdk/framework/d;->b(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x9 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/d;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
