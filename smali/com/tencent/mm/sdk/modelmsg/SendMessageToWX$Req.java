package com.tencent.mm.sdk.modelmsg; class SendMessageToWX$Req { void a() { int a;
a=0;// .class public Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;
a=0;// .super Lcom/tencent/mm/sdk/modelbase/BaseReq;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Req"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final FAV_CONTENT_LENGTH_LIMIT:I = 0x1900000
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "MicroMsg.SDK.SendMessageToWX.Req"
a=0;// 
a=0;// .field public static final WXSceneFavorite:I = 0x2
a=0;// 
a=0;// .field public static final WXSceneSession:I = 0x0
a=0;// 
a=0;// .field public static final WXSceneTimeline:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;// .field public scene:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/mm/sdk/modelbase/BaseReq;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/mm/sdk/modelbase/BaseReq;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->fromBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkArgs()Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.SendMessageToWX.Req"
a=0;// 
a=0;//     const-string v1, "checkArgs fail ,message is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;->type()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     iget-object v0, v0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/mm/sdk/modelmsg/WXFileObject;
a=0;// 
a=0;//     const/high16 v1, 0x1900000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/mm/sdk/modelmsg/WXFileObject;->setContentLengthLimit(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->checkArgs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public fromBundle(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->fromBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$Builder;->fromBundle(Landroid/os/Bundle;)Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     const-string v0, "_wxapi_sendmessagetowx_req_scene"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getType()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toBundle(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     invoke-static {v0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$Builder;->toBundle(Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_sendmessagetowx_req_scene"
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
