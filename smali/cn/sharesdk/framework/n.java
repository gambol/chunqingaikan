package cn.sharesdk.framework; class n { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/n;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcn/sharesdk/framework/n;->a:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/n;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/pm/PackageInfo;Landroid/content/Context;)Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/pm/PackageInfo;",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     sget-boolean v0, Lcn/sharesdk/framework/n;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p2}, Lcn/sharesdk/framework/n;->d(Landroid/content/Context;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Ldalvik/system/DexFile;
a=0;// 
a=0;//     #v0=(UninitRef,Ldalvik/system/DexFile;);
a=0;//     iget-object v2, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ldalvik/system/DexFile;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ldalvik/system/DexFile;);
a=0;//     invoke-virtual {v0}, Ldalvik/system/DexFile;->entries()Ljava/util/Enumeration;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ldalvik/system/DexFile;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "cn.sharesdk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const-string v3, "$"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-class v3, Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const-class v3, Lcn/sharesdk/framework/CustomPlatform;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-class v5, Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     aput-object p2, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Enumeration;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x2000
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v4, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/util/Iterator;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d(Landroid/content/Context;)Ljava/util/ArrayList;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v2, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const-string v1, "cn.sharesdk.douban.Douban"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v2, v0
a=0;// 
a=0;//     const-string v1, "cn.sharesdk.evernote.Evernote"
a=0;// 
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v3, "cn.sharesdk.facebook.Facebook"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.netease.microblog.NetEaseMicroBlog"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.renren.Renren"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.sina.weibo.SinaWeibo"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.sohu.microblog.SohuMicroBlog"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.sohu.suishenkan.SohuSuishenkan"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.kaixin.KaiXin"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.linkedin.LinkedIn"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.system.email.Email"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.system.text.ShortMessage"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.tencent.qq.QQ"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.tencent.qzone.QZone"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.tencent.weibo.TencentWeibo"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.twitter.Twitter"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.wechat.friends.Wechat"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.wechat.moments.WechatMoments"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x12
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.wechat.favorite.WechatFavorite"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.youdao.YouDao"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.google.GooglePlus"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x15
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.foursquare.FourSquare"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x16
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.pinterest.Pinterest"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x17
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.flickr.Flickr"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x18
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.tumblr.Tumblr"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x19
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.dropbox.Dropbox"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x1a
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.vkontakte.VKontakte"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x1b
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.instagram.Instagram"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x1c
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.yixin.friends.Yixin"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x1d
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.yixin.moments.YixinMoments"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x1e
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.mingdao.Mingdao"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x1f
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.line.Line"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.kakao.story.KakaoStory"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x21
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.kakao.talk.KakaoTalk"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x22
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.system.bluetooth.Bluetooth"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x23
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.whatsapp.WhatsApp"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x24
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.pocket.Pocket"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     const/16 v1, 0x25
a=0;// 
a=0;//     const-string v3, "cn.sharesdk.instapaper.Instapaper"
a=0;// 
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v1, v4, :cond_0
a=0;// 
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-class v7, Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     aput-object p1, v5, v6
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "2.4.1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(ILjava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     invoke-virtual {v0, p2}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     invoke-virtual {v0, p2}, Lcn/sharesdk/framework/statistics/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     move-object v1, p3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v3, p5
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move-object v5, p6
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/n;->c(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-direct {p0, v0, p1}, Lcn/sharesdk/framework/n;->a(Landroid/content/pm/PackageInfo;Landroid/content/Context;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/n;->a(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(IILjava/util/HashMap;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(II",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(ILcn/sharesdk/framework/Platform;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/b/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/b/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/statistics/b/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b/d;);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcn/sharesdk/framework/statistics/b/d;->b:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/statistics/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/statistics/b;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/statistics/b;->a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);
a=0;//     const-string v1, "SHARESDK_ENTER_SHAREMENU"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/b/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);
a=0;//     const-string v1, "SHARESDK_CANCEL_SHAREMENU"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/b/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);
a=0;//     const-string v1, "SHARESDK_EDIT_SHARE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/b/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);
a=0;//     const-string v1, "SHARESDK_FAILED_SHARE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/b/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v1=(Uninit);
a=0;//     const-string v1, "SHARESDK_CANCEL_SHARE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/b/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;ZI)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b;);
a=0;//     invoke-virtual {v0, p2}, Lcn/sharesdk/framework/statistics/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Lcn/sharesdk/framework/statistics/b;->a(Landroid/os/Handler;)V
a=0;// 
a=0;//     invoke-virtual {v0, p4}, Lcn/sharesdk/framework/statistics/b;->a(Z)V
a=0;// 
a=0;//     invoke-virtual {v0, p5}, Lcn/sharesdk/framework/statistics/b;->a(I)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/b;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v1, Lcn/sharesdk/framework/statistics/b/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/statistics/b/a;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/statistics/b/a;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/statistics/b/a;);
a=0;//     iput-object p1, v1, Lcn/sharesdk/framework/statistics/b/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput p2, v1, Lcn/sharesdk/framework/statistics/b/a;->a:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/statistics/b;->a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcn/sharesdk/framework/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/o;);
a=0;//     invoke-direct {v0, p0}, Lcn/sharesdk/framework/o;-><init>(Lcn/sharesdk/framework/n;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/o;);
a=0;//     invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/HashMap;Ljava/util/HashMap;)Z
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "fakelist"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);
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
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "snsplat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v2, :cond_2
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x27
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/b;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
