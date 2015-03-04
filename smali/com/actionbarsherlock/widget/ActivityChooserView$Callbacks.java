package com.actionbarsherlock.widget; class ActivityChooserView$Callbacks { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityChooserView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Landroid/view/View$OnLongClickListener;
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// .implements Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "Callbacks"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/widget/AdapterView$OnItemClickListener;",
a=0;//         "Landroid/view/View$OnClickListener;",
a=0;//         "Landroid/view/View$OnLongClickListener;",
a=0;//         "Landroid/widget/PopupWindow$OnDismissListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserView;Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserView;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private notifyOnDismissListener()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 614
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$9(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$9(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V
a=0;// 
a=0;//     .line 617
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 575
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$5(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     .line 576
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->dismissPopup()Z
a=0;// 
a=0;//     .line 577
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 578
a=0;//     .local v0, "defaultActivity":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getActivityIndex(Landroid/content/pm/ResolveInfo;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 579
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 580
a=0;//     .local v2, "launchIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 581
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$4(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 589
a=0;//     .end local v0    # "defaultActivity":Landroid/content/pm/ResolveInfo;
a=0;//     .end local v1    # "index":I
a=0;//     .end local v2    # "launchIntent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 583
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$6(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-ne p1, v3, :cond_2
a=0;// 
a=0;//     .line 584
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$7(Lcom/actionbarsherlock/widget/ActivityChooserView;Z)V
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v4}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$8(Lcom/actionbarsherlock/widget/ActivityChooserView;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$2(Lcom/actionbarsherlock/widget/ActivityChooserView;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 587
a=0;//     :cond_2
a=0;//     #v4=(Uninit);
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public onDismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 607
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->notifyOnDismissListener()V
a=0;// 
a=0;//     .line 608
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserView;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 609
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserView;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/view/ActionProvider;->subUiVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 611
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 5
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 545
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     .line 546
a=0;//     .local v0, "adapter":Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;//     invoke-virtual {v0, p3}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 547
a=0;//     .local v1, "itemViewType":I
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 569
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 549
a=0;//     :pswitch_0
a=0;//     #v3=(Uninit);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     const v4, 0x7fffffff
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$2(Lcom/actionbarsherlock/widget/ActivityChooserView;I)V
a=0;// 
a=0;//     .line 571
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 552
a=0;//     :pswitch_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->dismissPopup()Z
a=0;// 
a=0;//     .line 553
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$3(Lcom/actionbarsherlock/widget/ActivityChooserView;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 555
a=0;//     if-lez p3, :cond_0
a=0;// 
a=0;//     .line 556
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->setDefaultActivity(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 561
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getShowDefaultActivity()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 562
a=0;//     :goto_1
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 563
a=0;//     .local v2, "launchIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 564
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$4(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 561
a=0;//     .end local v2    # "launchIntent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Boolean);
a=0;//     add-int/lit8 p3, p3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 547
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onLongClick(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 594
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$5(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 595
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 596
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v0, v2}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$7(Lcom/actionbarsherlock/widget/ActivityChooserView;Z)V
a=0;// 
a=0;//     .line 597
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$Callbacks;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$8(Lcom/actionbarsherlock/widget/ActivityChooserView;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$2(Lcom/actionbarsherlock/widget/ActivityChooserView;I)V
a=0;// 
a=0;//     .line 602
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 600
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// .end method
}}
