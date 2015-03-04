package com.twocloo.com.cn.activitys; class BaseReadBook$16 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BaseReadBook$16;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseReadBook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BaseReadBook;->setSeekInint()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     .line 817
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook$16;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
a=0;//     .locals 0
a=0;//     .param p1, "seekBar"    # Landroid/widget/SeekBar;
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 832
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 0
a=0;//     .param p1, "seekBar"    # Landroid/widget/SeekBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 829
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 2
a=0;//     .param p1, "seekBar"    # Landroid/widget/SeekBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 819
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readlightseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 820
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readlightseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x5
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/Util;->setBrightness(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 821
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readlightseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x5
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrld(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 826
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 823
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readlightseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/Util;->setBrightness(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 824
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$16;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readlightseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrld(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
