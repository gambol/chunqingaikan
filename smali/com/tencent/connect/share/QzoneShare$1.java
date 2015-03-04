package com.tencent.connect.share; class QzoneShare$1 { void a() { int a;
a=0;// .class Lcom/tencent/connect/share/QzoneShare$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/share/QzoneShare;->shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/os/Bundle;
a=0;// 
a=0;// .field final synthetic b:Landroid/app/Activity;
a=0;// 
a=0;// .field final synthetic c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic d:Lcom/tencent/connect/share/QzoneShare;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/share/QzoneShare;Landroid/os/Bundle;Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     iput-object p1, p0, Lcom/tencent/connect/share/QzoneShare$1;->d:Lcom/tencent/connect/share/QzoneShare;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/connect/share/QzoneShare$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/connect/share/QzoneShare$1;->b:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/tencent/connect/share/QzoneShare$1;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/share/QzoneShare$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public batchSaved(ILjava/util/ArrayList;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QzoneShare$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "imageUrl"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 230
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QzoneShare$1;->d:Lcom/tencent/connect/share/QzoneShare;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/share/QzoneShare;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/QzoneShare$1;->b:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/share/QzoneShare$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/share/QzoneShare$1;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/share/QzoneShare;->a(Lcom/tencent/connect/share/QzoneShare;Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 231
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public saved(ILjava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     return-void
a=0;// .end method
}}
