package com.twocloo.com.cn.activitys; class Readbook$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/Readbook$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/Readbook;->setJumpLis()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 780
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$3;);
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
a=0;//     .line 783
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 2
a=0;//     .param p1, "seekBar"    # Landroid/widget/SeekBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 786
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$24(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;// 
a=0;//     .line 787
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 4
a=0;//     .param p1, "seekBar"    # Landroid/widget/SeekBar;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     .line 790
a=0;//     #v3=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->access$25(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->jump(I)V
a=0;// 
a=0;//     .line 792
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->access$2(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
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
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 793
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     .line 794
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 795
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 799
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->refresh()V
a=0;// 
a=0;//     .line 801
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 797
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$3;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
