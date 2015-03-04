package com.twocloo.com.cn.activitys; class BaseReadBook$15 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BaseReadBook$15;
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     .line 799
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook$15;);
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
a=0;//     .line 814
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 2
a=0;//     .param p1, "seekBar"    # Landroid/widget/SeekBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 810
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$11(Lcom/twocloo/com/cn/activitys/BaseReadBook;I)V
a=0;// 
a=0;//     .line 811
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 2
a=0;//     .param p1, "seekBar"    # Landroid/widget/SeekBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 802
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$10(Lcom/twocloo/com/cn/activitys/BaseReadBook;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 803
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->setFontSize(I)V
a=0;// 
a=0;//     .line 804
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->refresh()V
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$15;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setFontsize(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 807
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
