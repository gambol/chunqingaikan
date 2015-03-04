package cn.sharesdk.framework; class FakeActivity { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/FakeActivity;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static shell:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcn/sharesdk/framework/ShareSDKUIShell;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected activity:Landroid/app/Activity;
a=0;// 
a=0;// .field private contentView:Landroid/view/View;
a=0;// 
a=0;// .field private result:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private resultReceiver:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setShell(Ljava/lang/Class;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcn/sharesdk/framework/ShareSDKUIShell;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     sput-object p0, Lcn/sharesdk/framework/FakeActivity;->shell:Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final finish()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/FakeActivity;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getContentView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/FakeActivity;->contentView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/FakeActivity;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getParent()Lcn/sharesdk/framework/FakeActivity;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/FakeActivity;->resultReceiver:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onFinish()Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyEvent(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPause()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRestart()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResult(Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public runOnUIThread(Ljava/lang/Runnable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcn/sharesdk/framework/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/b;);
a=0;//     invoke-direct {v1, p0, p1}, Lcn/sharesdk/framework/b;-><init>(Lcn/sharesdk/framework/FakeActivity;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/b;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/UIHandler;->sendEmptyMessage(ILandroid/os/Handler$Callback;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public runOnUIThread(Ljava/lang/Runnable;J)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcn/sharesdk/framework/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/c;);
a=0;//     invoke-direct {v1, p0, p1}, Lcn/sharesdk/framework/c;-><init>(Lcn/sharesdk/framework/FakeActivity;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/c;);
a=0;//     invoke-static {v0, p2, p3, v1}, Lcn/sharesdk/framework/utils/UIHandler;->sendEmptyMessageDelayed(IJLandroid/os/Handler$Callback;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method sendResult()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/FakeActivity;->resultReceiver:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/FakeActivity;->resultReceiver:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/FakeActivity;->result:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/FakeActivity;->onResult(Ljava/util/HashMap;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setActivity(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/FakeActivity;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final setContentView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/FakeActivity;->contentView:Landroid/view/View;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setResult(Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/FakeActivity;->result:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcn/sharesdk/framework/FakeActivity;->showForResult(Landroid/content/Context;Landroid/content/Intent;Lcn/sharesdk/framework/FakeActivity;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showForResult(Landroid/content/Context;Landroid/content/Intent;Lcn/sharesdk/framework/FakeActivity;)V
a=0;//     .locals 4
a=0;// 
a=0;//     iput-object p3, p0, Lcn/sharesdk/framework/FakeActivity;->resultReceiver:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     new-instance v1, Landroid/os/Message;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v1}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v0, Lcn/sharesdk/framework/FakeActivity;->shell:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-class v0, Lcn/sharesdk/framework/ShareSDKUIShell;
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-direct {v2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {p0}, Lcn/sharesdk/framework/ShareSDKUIShell;->a(Lcn/sharesdk/framework/FakeActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "launch_time"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v0, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aput-object v2, v0, v3
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/a;);
a=0;//     invoke-direct {v0, p0}, Lcn/sharesdk/framework/a;-><init>(Lcn/sharesdk/framework/FakeActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/a;);
a=0;//     invoke-static {v1, v0}, Lcn/sharesdk/framework/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);v3=(Uninit);
a=0;//     sget-object v0, Lcn/sharesdk/framework/FakeActivity;->shell:Ljava/lang/Class;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startActivity(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, p1, v0}, Lcn/sharesdk/framework/FakeActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivityForResult(Landroid/content/Intent;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/FakeActivity;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
