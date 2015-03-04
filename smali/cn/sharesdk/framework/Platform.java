package cn.sharesdk.framework; class Platform { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/Platform;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/sharesdk/framework/Platform$ShareParams;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ACTION_AUTHORIZING:I = 0x1
a=0;// 
a=0;// .field protected static final ACTION_CUSTOMER:I = 0xa0000
a=0;// 
a=0;// .field public static final ACTION_FOLLOWING_USER:I = 0x6
a=0;// 
a=0;// .field public static final ACTION_GETTING_FRIEND_LIST:I = 0x2
a=0;// 
a=0;// .field public static final ACTION_SENDING_DIRECT_MESSAGE:I = 0x5
a=0;// 
a=0;// .field public static final ACTION_SHARE:I = 0x9
a=0;// 
a=0;// .field public static final ACTION_TIMELINE:I = 0x7
a=0;// 
a=0;// .field public static final ACTION_USER_INFOR:I = 0x8
a=0;// 
a=0;// .field public static final CUSTOMER_ACTION_MASK:I = 0xffff
a=0;// 
a=0;// .field public static final SHARE_APPS:I = 0x7
a=0;// 
a=0;// .field public static final SHARE_EMOJI:I = 0x9
a=0;// 
a=0;// .field public static final SHARE_FILE:I = 0x8
a=0;// 
a=0;// .field public static final SHARE_IMAGE:I = 0x2
a=0;// 
a=0;// .field public static final SHARE_MUSIC:I = 0x5
a=0;// 
a=0;// .field public static final SHARE_TEXT:I = 0x1
a=0;// 
a=0;// .field public static final SHARE_VIDEO:I = 0x6
a=0;// 
a=0;// .field public static final SHARE_WEBPAGE:I = 0x4
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;// .field protected final context:Landroid/content/Context;
a=0;// 
a=0;// .field protected final db:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;// .field protected listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/Platform;->context:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/i;);
a=0;//     invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/i;-><init>(Lcn/sharesdk/framework/Platform;Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/Platform;->db:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->i()Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/Platform;->listener:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public SSOSetting(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->a(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method a()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/i;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected afterRegister(ILjava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/i;->c(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public authorize()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/Platform;->authorize([Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public authorize([Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->a([Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->f()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract checkAuthorize(ILjava/lang/Object;)Z
a=0;// .end method
a=0;// 
a=0;// .method protected copyDevinfo(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p1, p2}, Lcn/sharesdk/framework/ShareSDK;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected copyNetworkDevinfo(II)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p1, p2}, Lcn/sharesdk/framework/ShareSDK;->a(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public customerProtocol(Ljava/lang/String;Ljava/lang/String;SLjava/util/HashMap;Ljava/util/HashMap;)V
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "S",
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
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Short);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;Ljava/lang/String;SLjava/util/HashMap;Ljava/util/HashMap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract doAuthorize([Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract doCustomerProtocol(Ljava/lang/String;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/HashMap;)V
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
a=0;// .end method
a=0;// 
a=0;// .method protected abstract doShare(Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract filterShareContent(Lcn/sharesdk/framework/Platform$ShareParams;Ljava/util/HashMap;)Lcn/sharesdk/framework/statistics/b/f$a;
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
a=0;// .end method
a=0;// 
a=0;// .method protected abstract follow(Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public followFriend(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->db:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDevinfo(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/Platform;->getDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1, p2}, Lcn/sharesdk/framework/ShareSDK;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract getFriendList(IILjava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract getName()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method protected getNetworkDevinfo(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcn/sharesdk/framework/i;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getNetworkDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, p1, p2}, Lcn/sharesdk/framework/Platform;->getNetworkDevinfo(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPlatformActionListener()Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->c()Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract getPlatformId()I
a=0;// .end method
a=0;// 
a=0;// .method public getShortLintk(Ljava/lang/String;Z)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSortId()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTimeLine(Ljava/lang/String;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract getVersion()I
a=0;// .end method
a=0;// 
a=0;// .method protected abstract initDevInfo(Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method protected innerAuthorize(ILjava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/i;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isSSODisable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isValid()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public listFriend(IILjava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcn/sharesdk/framework/i;->a(IILjava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAccount()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/i;->h()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract setNetworkDevinfo()V
a=0;// .end method
a=0;// 
a=0;// .method public setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public share(Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showUser(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract timeline(IILjava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method protected uploadImageToFileServer(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected uploadImageToFileServer(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/Platform;->a:Lcn/sharesdk/framework/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/i;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract userInfor(Ljava/lang/String;)V
a=0;// .end method
}}
