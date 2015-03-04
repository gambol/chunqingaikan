package cn.sharesdk.wechat.utils; class d { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/d;
a=0;// .super Lcn/sharesdk/wechat/utils/l;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;// .field public b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/wechat/utils/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcn/sharesdk/wechat/utils/l;->a(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/wechat/utils/WXMediaMessage$a;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_sendmessagetowx_req_scene"
a=0;// 
a=0;//     iget v1, p0, Lcn/sharesdk/wechat/utils/d;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "checkArgs fail, thumbData should not be null when send emoji"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(PosByte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v2, 0x8000
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-le v1, v2, :cond_2
a=0;// 
a=0;//     const-string v1, "checkArgs fail, thumbData is invalid"
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
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x200
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_3
a=0;// 
a=0;//     const-string v1, "checkArgs fail, title is invalid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iget-object v3, v3, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     const/16 v4, 0x3fd
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "..."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     const-string v1, "checkArgs fail, mediaObject is null"
a=0;// 
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;->checkArgs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
