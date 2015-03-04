package safiap.framework.ui; class c { void a() { int a;
a=0;// .class final Lsafiap/framework/ui/c;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private synthetic e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 560
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lsafiap/framework/ui/c;->e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     .line 561
a=0;//     #p0=(Reference,Lsafiap/framework/ui/c;);
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->a:I
a=0;// 
a=0;//     .line 562
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->b:I
a=0;// 
a=0;//     .line 563
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->c:I
a=0;// 
a=0;//     .line 564
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->d:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 568
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 582
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/16 v1, 0x4e20
a=0;// 
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 587
a=0;//     iget v0, p0, Lsafiap/framework/ui/c;->d:I
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x64
a=0;// 
a=0;//     iget v1, p0, Lsafiap/framework/ui/c;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->a:I
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/c;->e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 590
a=0;//     iget v0, p0, Lsafiap/framework/ui/c;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lsafiap/framework/ui/c;->a:I
a=0;// 
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 591
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/c;->e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lsafiap/framework/ui/c;->a:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->a(I)V
a=0;// 
a=0;//     .line 592
a=0;//     iget v0, p0, Lsafiap/framework/ui/c;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->b:I
a=0;// 
a=0;//     .line 597
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 598
a=0;//     return-void
a=0;// 
a=0;//     .line 570
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->d:I
a=0;// 
a=0;//     .line 571
a=0;//     iget v0, p0, Lsafiap/framework/ui/c;->c:I
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 572
a=0;//     iget v0, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     iput v0, p0, Lsafiap/framework/ui/c;->c:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 576
a=0;//     :sswitch_1
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/c;->e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/UpdateHintActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 577
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/c;->e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-virtual {v1}, Lsafiap/framework/ui/UpdateHintActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->ACTION_NETWORK_ERROR:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 578
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/c;->e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 581
a=0;//     :sswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/c;->e:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 568
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x2710 -> :sswitch_1
a=0;//         0x4e20 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
}}
