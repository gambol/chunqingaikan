package cn.sharesdk.wechat.utils; class WXMusicObject { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/WXMusicObject;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public musicDataUrl:Ljava/lang/String;
a=0;// 
a=0;// .field public musicLowBandDataUrl:Ljava/lang/String;
a=0;// 
a=0;// .field public musicLowBandUrl:Ljava/lang/String;
a=0;// 
a=0;// .field public musicUrl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/WXMusicObject;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkArgs()Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/16 v2, 0x2800
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicLowBandUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "both musicUrl and musicLowBandUrl are null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(PosShort);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v2, :cond_1
a=0;// 
a=0;//     const-string v1, "checkArgs fail, musicUrl is too long"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(PosShort);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicLowBandUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicLowBandUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v2, :cond_2
a=0;// 
a=0;//     const-string v1, "checkArgs fail, musicLowBandUrl is too long"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(PosShort);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public serialize(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicLowBandUrl"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicLowBandUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicDataUrl"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicDataUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicLowBandDataUrl"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicLowBandDataUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public type()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public unserialize(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicUrl:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicLowBandUrl"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicLowBandUrl:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicDataUrl"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicDataUrl:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxmusicobject_musicLowBandDataUrl"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicLowBandDataUrl:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
