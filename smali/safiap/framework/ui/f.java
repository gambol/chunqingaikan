package safiap.framework.ui; class f { void a() { int a;
a=0;// .class final Lsafiap/framework/ui/f;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/ui/res/LayoutDialog$a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:I
a=0;// 
a=0;// .field private synthetic b:I
a=0;// 
a=0;// .field private synthetic c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     iput-object p1, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     iput p2, p0, Lsafiap/framework/ui/f;->a:I
a=0;// 
a=0;//     iput p3, p0, Lsafiap/framework/ui/f;->b:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/ui/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     invoke-static {}, Lsafiap/framework/ui/UpdateHintActivity;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "canceled ... , isChecked: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->b()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 382
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     iget v0, p0, Lsafiap/framework/ui/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x7532
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lsafiap/framework/ui/f;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Lsafiap/framework/a/a;->a(Landroid/content/Context;Ljava/lang/String;I)Z
a=0;// 
a=0;//     .line 387
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->dismiss()V
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->c(Lsafiap/framework/ui/UpdateHintActivity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     const-string v1, "\u60a8\u9700\u8981\u5347\u7ea7\u540e\u624d\u80fd\u7ee7\u7eed\u652f\u4ed8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 395
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 391
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/f;->c:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
