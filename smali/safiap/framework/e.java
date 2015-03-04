package safiap.framework; class e { void a() { int a;
a=0;// .class final Lsafiap/framework/e;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/SafFrameworkManager;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1253
a=0;//     iput-object p1, p0, Lsafiap/framework/e;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1256
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 1257
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "handle message: msg.what: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1258
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1263
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1260
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     new-instance v0, Lsafiap/framework/UpdateManager;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/UpdateManager;);
a=0;//     iget-object v1, p0, Lsafiap/framework/e;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lsafiap/framework/UpdateManager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1261
a=0;//     #v0=(Reference,Lsafiap/framework/UpdateManager;);
a=0;//     iget-object v1, p0, Lsafiap/framework/e;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->h(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/e;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v2}, Lsafiap/framework/SafFrameworkManager;->i(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lsafiap/framework/SafFrameworkManager$f;->a(Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lsafiap/framework/UpdateManager;->startQueryUpdateTask(Lsafiap/framework/UpdateManager$OnGotUpdateListListener;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1262
a=0;//     iget-object v0, p0, Lsafiap/framework/e;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->i(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1258
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x6f
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
