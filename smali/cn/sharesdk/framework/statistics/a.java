package cn.sharesdk.framework.statistics; class a { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/statistics/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static b:Ljava/lang/String;
a=0;// 
a=0;// .field static c:Ljava/lang/String;
a=0;// 
a=0;// .field private static d:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;// .field private static e:Ljava/lang/String;
a=0;// 
a=0;// .field private static f:Ljava/lang/String;
a=0;// 
a=0;// .field private static g:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "http://api2.sharesdk.cn:5566"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "http://api2.sharesdk.cn:5566/conf3"
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "http://s.sharesdk.cn/api/convert3.do"
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "http://up.sharesdk.cn/upload/image"
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a;->g:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/h;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/network/h;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/h;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/a;->d:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/a;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/statistics/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a;->d:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/a;->d:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/a;->d:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v8, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/util/regex/Matcher;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "key"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, p2}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move v1, v6
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     new-instance v4, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v5, "urls"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v5, v0}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "deviceid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "snsplat"
a=0;// 
a=0;//     invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v0, "> deviceid  devicekey: %s"
a=0;// 
a=0;//     new-array v1, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v6
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     invoke-direct {p0, p2, p5}, Lcn/sharesdk/framework/statistics/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v3, "m"
a=0;// 
a=0;//     invoke-direct {v1, v3, v0}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "> SERVER_SHORT_LINK_URL  resp: %s"
a=0;// 
a=0;//     new-array v2, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v2, v6
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_1
a=0;//     const-string v0, "status"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     const-string v0, "data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v3, "surl"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "source"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v8, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move v0, v6
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_6
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     const-string v0, "> SERVER_SHORT_LINK_URL content after replace link ===  %s"
a=0;// 
a=0;//     new-array v1, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p1, v1, v6
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/date"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(Null);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "m"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, p1}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "t"
a=0;// 
a=0;//     invoke-direct {v0, v1, p2}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "> %s  resp: %s"
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/Object;);v3=(One);v4=(Reference,Ljava/lang/String;);v5=(Null);
a=0;//     move v0, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/log4"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/statistics/a/c;->b()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/statistics/a/c;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->u()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v4, p0, Lcn/sharesdk/framework/statistics/a;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit16 v4, v4, 0x4e20
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->o()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v4}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v4}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v4}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v4}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v4}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "shorLinkMsg ===>>>>"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v1, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     const-string v2, "Base64AES key ===>>>>"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ":"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     const-string v2, "%s:%s"
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object p1, v3, v0
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;[B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Boolean);v3=(Reference,Ljava/lang/StringBuilder;);v4=(Reference,Ljava/lang/StringBuilder;);v5=(Reference,Ljava/lang/String;);v6=(Uninit);
a=0;//     const-string v2, "|||||"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v2=(Reference,Ujava/lang/Object;);v3=(Reference,Ljava/lang/StringBuilder;);v4=(Reference,Ujava/lang/Object;);v5=(Reference,Ljava/lang/String;);v6=(Uninit);
a=0;//     const-string v1, "\\|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "|||||"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private e()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/data"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private f()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/snsconf"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private g()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v2, "type"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "DEVICE"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "key"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "mac"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "udid"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "model"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "factory"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "plat"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->o()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "sysver"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "breaked"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "screensize"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "carrier"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private h()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v2, "type"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "PROCESS"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "plat"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->o()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "device"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "list"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->p()Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()J
a=0;//     .locals 6
a=0;// 
a=0;//     const-string v0, "{}"
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/h;);
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "timestamp"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "timestamp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v0, v3, v0
a=0;// 
a=0;//     const-string v3, "service_time"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/statistics/a/c;->a()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)J
a=0;//     .locals 10
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     :try_start_0
a=0;//     #v9=(Reference,Lcn/sharesdk/framework/utils/b;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "appkey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, p1}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "device"
a=0;// 
a=0;//     invoke-virtual {v9}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "plat"
a=0;// 
a=0;//     invoke-virtual {v9}, Lcn/sharesdk/framework/utils/b;->o()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "apppkg"
a=0;// 
a=0;//     invoke-virtual {v9}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "appver"
a=0;// 
a=0;//     invoke-virtual {v9}, Lcn/sharesdk/framework/utils/b;->t()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget v0, p0, Lcn/sharesdk/framework/statistics/a;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit16 v0, v0, 0x4e20
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v3, "sdkver"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3, v0}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "networktype"
a=0;// 
a=0;//     invoke-virtual {v9}, Lcn/sharesdk/framework/utils/b;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/a;->e:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v0, "{}"
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v1, " get server config response == %s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v3, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v3}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v3, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v0, "status"
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v0, "status"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, -0xc8
a=0;// 
a=0;//     #v4=(Short);
a=0;//     if-ne v0, v4, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v4, "error"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-wide v7, v1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v7=(LongLo);v8=(LongHi);
a=0;//     return-wide v7
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const-string v0, "{}"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(LongLo);v2=(LongHi);v3=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v0, "timestamp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     const-string v0, "timestamp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v0, v4, v0
a=0;// 
a=0;//     const-string v2, "service_time"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v6, v2, v4}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     move-wide v7, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(LongLo);v8=(LongHi);
a=0;//     const-string v0, "switchs"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v0, "switchs"
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "device"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "share"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "auth"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Lcn/sharesdk/framework/statistics/a/c;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Lcn/sharesdk/framework/statistics/a/c;->f(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcn/sharesdk/framework/statistics/a/c;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "requesthost"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const-string v0, "requestport"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const-string v0, "requesthost"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "requestport"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "http://"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ":"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "unfinish"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     check-cast v6, Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "device"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, " upload device info == %s"
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
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v3, "m"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "sdk.sharesdk.sdk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4}, Lcn/sharesdk/framework/utils/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v3, v0}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "> DEVICE_UNFINISHED  resp: %s"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "apps"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     :try_start_2
a=0;//     const-string v0, "APPS"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v9, v1}, Lcn/sharesdk/framework/utils/b;->a(Z)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "process"
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, " upload device info == %s"
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
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v3, "m"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "sdk.sharesdk.sdk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4}, Lcn/sharesdk/framework/utils/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v3, v0}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "> PROCESS_UNFINISHED  resp: %s"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v1=(LongLo);v2=(LongHi);v7=(Uninit);v8=(Uninit);
a=0;//     move-wide v7, v1
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "bm_tmp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ".png"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/statistics/a;->b(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const-string v0, "> SERVER_SHORT_LINK_URL content before replace link ===  %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     const-string v3, "<a[^>]*?href[\\s]*=[\\s]*[\"\']?([^\'\">]+?)[\'\"]?>"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v3, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;[B)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {p2, p1}, Lcn/sharesdk/framework/utils/a;->a([BLjava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_1
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/Throwable;);v3=(Conflicted);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, " event string == %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/statistics/b/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v4, v3
a=0;// 
a=0;//     invoke-static {v2, v4}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     instance-of v2, p1, Lcn/sharesdk/framework/statistics/b/g;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     const-string v2, "none"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->u()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ShareSDK/"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->getSDKVersionName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Android/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
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
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Lcn/sharesdk/framework/statistics/a/c;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iput-object v9, p1, Lcn/sharesdk/framework/statistics/b/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v5}, Lcn/sharesdk/framework/statistics/a/c;->a()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/statistics/a;->a()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sub-long v0, v2, v0
a=0;// 
a=0;//     iput-wide v0, p1, Lcn/sharesdk/framework/statistics/b/c;->e:J
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/statistics/b/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v2, p1, Lcn/sharesdk/framework/statistics/b/c;->e:J
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lcn/sharesdk/framework/statistics/a/e;->a(Landroid/content/Context;Ljava/lang/String;J)J
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Reference,[Ljava/lang/Object;);v6=(Uninit);v7=(Uninit);v8=(One);
a=0;//     instance-of v0, p1, Lcn/sharesdk/framework/statistics/b/b;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcn/sharesdk/framework/statistics/a/c;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b/c;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/statistics/b/b;
a=0;// 
a=0;//     iget-object v2, v0, Lcn/sharesdk/framework/statistics/b/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b/c;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/statistics/b/b;
a=0;// 
a=0;//     iget-object v1, p1, Lcn/sharesdk/framework/statistics/b/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcn/sharesdk/framework/utils/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/b/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Reference,[Ljava/lang/Object;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b/c;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/statistics/b/b;
a=0;// 
a=0;//     iput-object v9, v0, Lcn/sharesdk/framework/statistics/b/b;->d:Ljava/lang/String;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/statistics/b/b;
a=0;// 
a=0;//     iput-object v9, v0, Lcn/sharesdk/framework/statistics/b/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     instance-of v0, p1, Lcn/sharesdk/framework/statistics/b/f;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b/c;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/statistics/b/f;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcn/sharesdk/framework/statistics/a/c;->d()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v5}, Lcn/sharesdk/framework/statistics/a/c;->c()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     iget-object v7, v0, Lcn/sharesdk/framework/statistics/b/f;->d:Lcn/sharesdk/framework/statistics/b/f$a;
a=0;// 
a=0;//     #v7=(Reference,Lcn/sharesdk/framework/statistics/b/f$a;);
a=0;//     if-eq v1, v8, :cond_6
a=0;// 
a=0;//     if-nez v1, :cond_e
a=0;// 
a=0;//     iget-boolean v1, p0, Lcn/sharesdk/framework/statistics/a;->h:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Integer);
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     iget-object v1, v7, Lcn/sharesdk/framework/statistics/b/f$a;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Integer);v8=(Conflicted);
a=0;//     if-ge v4, v2, :cond_a
a=0;// 
a=0;//     iget-object v1, v7, Lcn/sharesdk/framework/statistics/b/f$a;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcn/sharesdk/framework/statistics/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     iget-object v8, v7, Lcn/sharesdk/framework/statistics/b/f$a;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_8
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v1, v4, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v4, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v2=(Conflicted);v4=(Reference,[Ljava/lang/Object;);v8=(One);
a=0;//     iget-object v1, v7, Lcn/sharesdk/framework/statistics/b/f$a;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v4=(Integer);v8=(Conflicted);
a=0;//     if-eqz v7, :cond_b
a=0;// 
a=0;//     iget-object v1, v7, Lcn/sharesdk/framework/statistics/b/f$a;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_d
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     if-ge v3, v2, :cond_f
a=0;// 
a=0;//     iget-object v1, v7, Lcn/sharesdk/framework/statistics/b/f$a;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     iget-object v4, v7, Lcn/sharesdk/framework/statistics/b/f$a;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_c
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_d
a=0;//     #v3=(Null);v4=(Integer);
a=0;//     iget-object v1, v7, Lcn/sharesdk/framework/statistics/b/f$a;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_e
a=0;//     #v2=(Conflicted);v4=(Reference,[Ljava/lang/Object;);v8=(One);
a=0;//     iput-object v9, v0, Lcn/sharesdk/framework/statistics/b/f;->d:Lcn/sharesdk/framework/statistics/b/f$a;
a=0;// 
a=0;//     :cond_f
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     iput-object v9, v0, Lcn/sharesdk/framework/statistics/b/f;->n:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/statistics/a/c;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "plat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->o()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "device"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "list"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " upload apps info == %s"
a=0;// 
a=0;//     new-array v2, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v2, v6
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v4, "m"
a=0;// 
a=0;//     const-string v5, "sdk.sharesdk.sdk"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lcn/sharesdk/framework/utils/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v4, v0}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     sget-object v5, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1, v5}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "> APPS_UNFINISHED  resp: %s"
a=0;// 
a=0;//     new-array v2, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v2, v6
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcn/sharesdk/framework/statistics/a;->h:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/a;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, " upload file , server url = %s, file path = %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     aput-object p1, v2, v4
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v3, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v0, "file"
a=0;// 
a=0;//     invoke-direct {v3, v0, p1}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "User-Agent"
a=0;// 
a=0;//     sget-object v5, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v5}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "upload file response == %s"
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
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v0, "status"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "status"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     move-object v6, v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/HashMap;);v2=(Reference,[Ljava/lang/Object;);v3=(Null);v4=(Reference,Ljava/util/ArrayList;);v5=(Null);v6=(Null);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(PosShort);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcn/sharesdk/framework/utils/a;->a([B[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "none"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/a/e;->a(Landroid/content/Context;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/statistics/a/d;
a=0;// 
a=0;//     iget-object v2, v0, Lcn/sharesdk/framework/statistics/a/d;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v2, v4, :cond_3
a=0;// 
a=0;//     iget-object v2, v0, Lcn/sharesdk/framework/statistics/a/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2, v4}, Lcn/sharesdk/framework/statistics/a;->c(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/statistics/a/d;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcn/sharesdk/framework/statistics/a/e;->a(Landroid/content/Context;Ljava/util/ArrayList;)J
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/d;);v2=(Integer);v4=(One);
a=0;//     iget-object v2, v0, Lcn/sharesdk/framework/statistics/a/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lcn/sharesdk/framework/statistics/a;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2, v4}, Lcn/sharesdk/framework/statistics/a;->c(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v3, Ljava/util/zip/GZIPOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/zip/GZIPOutputStream;);
a=0;//     const/16 v4, 0x400
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     new-array v4, v4, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,[B);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/16 v6, 0x400
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-virtual {v1, v4, v5, v6}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eq v5, v6, :cond_0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v3, v4, v6, v5}, Ljava/util/zip/GZIPOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/ByteArrayInputStream;);v3=(Reference,Ljava/util/zip/GZIPOutputStream;);v4=(Reference,[B);v5=(Integer);v6=(Byte);
a=0;//     invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->finish()V
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v3, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public d(Ljava/lang/String;)Ljava/util/HashMap;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/statistics/a/c;->g(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public e(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "appkey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, p1}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v4, "device"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v4, v0}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     sget-object v5, Lcn/sharesdk/framework/statistics/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v5}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a;->j:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/a;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
