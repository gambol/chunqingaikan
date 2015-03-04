package safiap.framework.ui; class UpdateHintActivity$a { void a() { int a;
a=0;// .class final Lsafiap/framework/ui/UpdateHintActivity$a;
a=0;// .super Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/ui/UpdateHintActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 604
a=0;//     iput-object p1, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     .line 605
a=0;//     invoke-direct {p0}, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;-><init>()V
a=0;// 
a=0;//     .line 607
a=0;//     #p0=(Reference,Lsafiap/framework/ui/UpdateHintActivity$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onDownloadProgress(Ljava/lang/String;II)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 637
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 638
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 639
a=0;//     iput p2, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 640
a=0;//     iput p3, v0, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     .line 641
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v1}, Lsafiap/framework/ui/UpdateHintActivity;->g(Lsafiap/framework/ui/UpdateHintActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 642
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onFinishDownload(Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 612
a=0;//     invoke-static {}, Lsafiap/framework/ui/UpdateHintActivity;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onFinishDownload...start, result: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 614
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_2
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 616
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->dismiss()V
a=0;// 
a=0;//     .line 617
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->g(Lsafiap/framework/ui/UpdateHintActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 632
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 619
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 621
a=0;//     :cond_2
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 622
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 623
a=0;//     invoke-static {p1}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 624
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v0, v2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 626
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity$a;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
