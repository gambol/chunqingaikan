package com.tencent.mm.sdk.modelmsg; class ShowMessageFromWX$Req { void a() { int a;
a=0;// .class public Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;
a=0;// .super Lcom/tencent/mm/sdk/modelbase/BaseReq;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Req"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/mm/sdk/modelbase/BaseReq;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/mm/sdk/modelbase/BaseReq;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;);
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;->fromBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkArgs()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
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
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getType()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toBundle(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     invoke-static {v0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$Builder;->toBundle(Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-super {p0, v0}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
