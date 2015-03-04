package cn.sharesdk.wechat.friends; class Wechat { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/friends/Wechat;
a=0;// .super Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/sharesdk/wechat/friends/Wechat$ShareParams;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final NAME:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lcn/sharesdk/wechat/friends/Wechat;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/wechat/friends/Wechat;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/Platform;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/friends/Wechat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/wechat/friends/Wechat;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/wechat/friends/Wechat;ILjava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcn/sharesdk/wechat/friends/Wechat;->afterRegister(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/sharesdk/wechat/friends/Wechat;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcn/sharesdk/wechat/friends/Wechat;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcn/sharesdk/wechat/friends/Wechat;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected checkAuthorize(ILjava/lang/Object;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcn/sharesdk/wechat/utils/WechatHelper;->a()Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/wechat/utils/WechatHelper;->b()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/wechat/utils/WechatClientNotExistException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/wechat/utils/WechatClientNotExistException;);
a=0;//     invoke-direct {v2}, Lcn/sharesdk/wechat/utils/WechatClientNotExistException;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/wechat/utils/WechatClientNotExistException;);
a=0;//     invoke-interface {v1, p0, p1, v2}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq p1, v1, :cond_2
a=0;// 
a=0;//     invoke-super {p0}, Lcn/sharesdk/framework/Platform;->isValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/wechat/friends/Wechat;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     const-string v2, "refresh_token"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-virtual {p0, p1, p2}, Lcn/sharesdk/wechat/friends/Wechat;->innerAuthorize(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected doAuthorize([Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v3, "The params of appID or appSecret is missing !"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0, p0, v1, v2}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Lcn/sharesdk/wechat/utils/WechatHelper;->a()Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->b()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WechatClientNotExistException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WechatClientNotExistException;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WechatClientNotExistException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WechatClientNotExistException;);
a=0;//     invoke-interface {v0, p0, v4, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/g;);
a=0;//     const/16 v2, 0x16
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, p0, v2}, Lcn/sharesdk/wechat/utils/g;-><init>(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcn/sharesdk/wechat/utils/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/wechat/utils/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct {v2, p0}, Lcn/sharesdk/wechat/utils/k;-><init>(Lcn/sharesdk/framework/Platform;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-virtual {v2, v1}, Lcn/sharesdk/wechat/utils/k;->a(Lcn/sharesdk/wechat/utils/g;)V
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/friends/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/friends/a;);
a=0;//     invoke-direct {v1, p0}, Lcn/sharesdk/wechat/friends/a;-><init>(Lcn/sharesdk/wechat/friends/Wechat;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/friends/a;);
a=0;//     invoke-virtual {v2, v1}, Lcn/sharesdk/wechat/utils/k;->a(Lcn/sharesdk/framework/authorize/AuthorizeListener;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0, v2}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/k;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v1, p0, v4, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected doCustomerProtocol(Ljava/lang/String;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/HashMap;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v0, p0, p3}, Lcn/sharesdk/framework/PlatformActionListener;->onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected doShare(Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v0, "scene"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p1, v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/wechat/utils/WechatHelper;->a()Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->context:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct {v1, p0}, Lcn/sharesdk/wechat/utils/k;-><init>(Lcn/sharesdk/framework/Platform;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     iget-boolean v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->c:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0, v1, p1}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/k;Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ShareParams"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-interface {v1, p0, v2, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(PosByte);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v1, p0, v3, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     invoke-virtual {v1, p1, v2}, Lcn/sharesdk/wechat/utils/k;->a(Lcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Lcn/sharesdk/wechat/utils/k;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v1, p0, v3, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected filterShareContent(Lcn/sharesdk/framework/Platform$ShareParams;Ljava/util/HashMap;)Lcn/sharesdk/framework/statistics/b/f$a;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcn/sharesdk/framework/Platform$ShareParams;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Lcn/sharesdk/framework/statistics/b/f$a;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/b/f$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/b/f$a;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/statistics/b/f$a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b/f$a;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform$ShareParams;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/framework/statistics/b/f$a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform$ShareParams;->getImagePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageData()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v3, v0, Lcn/sharesdk/framework/statistics/b/f$a;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform$ShareParams;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v3, v0, Lcn/sharesdk/framework/statistics/b/f$a;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_1
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform$ShareParams;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "url"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "extInfo"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "content"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "image"
a=0;// 
a=0;//     iget-object v4, v0, Lcn/sharesdk/framework/statistics/b/f$a;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "musicFileUrl"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v3, v0, Lcn/sharesdk/framework/statistics/b/f$a;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v2, v0, Lcn/sharesdk/framework/statistics/b/f$a;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected follow(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, p0, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected getFriendList(IILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, p0, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/wechat/friends/Wechat;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPlatformId()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x16
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getVersion()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected initDevInfo(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, "AppId"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "AppSecret"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     const-string v1, "BypassApproval"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->c:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "WechatMoments"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     const-string v1, "WechatMoments"
a=0;// 
a=0;//     const-string v2, "BypassApproval"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v2}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->c:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     const-string v0, "WechatMoments"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcn/sharesdk/wechat/friends/Wechat;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->copyDevinfo(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     const-string v1, "BypassApproval"
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->c:Z
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "WechatFavorite"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "WechatFavorite"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcn/sharesdk/wechat/friends/Wechat;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->copyDevinfo(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/wechat/friends/Wechat;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isValid()Z
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/wechat/utils/WechatHelper;->a()Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0}, Lcn/sharesdk/framework/Platform;->isValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected setNetworkDevinfo()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0x25
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v3, 0x17
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v2, 0x16
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v0, "app_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "app_secret"
a=0;// 
a=0;//     const-string v1, "AppSecret"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "app_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0, v3, v2}, Lcn/sharesdk/wechat/friends/Wechat;->copyNetworkDevinfo(II)V
a=0;// 
a=0;//     const-string v0, "app_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "app_secret"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppSecret"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0, v3, v2}, Lcn/sharesdk/wechat/friends/Wechat;->copyNetworkDevinfo(II)V
a=0;// 
a=0;//     const-string v0, "app_secret"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppSecret"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     const-string v0, "app_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v4, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2}, Lcn/sharesdk/wechat/friends/Wechat;->copyNetworkDevinfo(II)V
a=0;// 
a=0;//     const-string v0, "app_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppId"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "app_secret"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppSecret"
a=0;// 
a=0;//     invoke-virtual {p0, v4, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2}, Lcn/sharesdk/wechat/friends/Wechat;->copyNetworkDevinfo(II)V
a=0;// 
a=0;//     const-string v0, "app_secret"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppSecret"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/wechat/friends/Wechat;->getNetworkDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected timeline(IILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, p0, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected userInfor(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v2, "The params of appID or appSecret is missing !"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0, p0, v3, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/g;);
a=0;//     const/16 v1, 0x16
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, p0, v1}, Lcn/sharesdk/wechat/utils/g;-><init>(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/friends/Wechat;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/sharesdk/wechat/utils/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/friends/Wechat;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-interface {v1, p0, v3, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
