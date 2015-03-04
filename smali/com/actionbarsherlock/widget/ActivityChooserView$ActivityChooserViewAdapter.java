package com.actionbarsherlock.widget; class ActivityChooserView$ActivityChooserViewAdapter { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ActivityChooserView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ActivityChooserViewAdapter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ITEM_VIEW_TYPE_ACTIVITY:I = 0x0
a=0;// 
a=0;// .field private static final ITEM_VIEW_TYPE_COUNT:I = 0x3
a=0;// 
a=0;// .field private static final ITEM_VIEW_TYPE_FOOTER:I = 0x1
a=0;// 
a=0;// .field public static final MAX_ACTIVITY_COUNT_DEFAULT:I = 0x4
a=0;// 
a=0;// .field public static final MAX_ACTIVITY_COUNT_UNLIMITED:I = 0x7fffffff
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;// .field private mHighlightDefaultActivity:Z
a=0;// 
a=0;// .field private mMaxActivityCount:I
a=0;// 
a=0;// .field private mShowDefaultActivity:Z
a=0;// 
a=0;// .field private mShowFooterView:Z
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserView;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 631
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 645
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserView;Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 631
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserView;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getActivityCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 798
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getActivityCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 684
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 685
a=0;//     .local v1, "count":I
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getActivityCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 686
a=0;//     .local v0, "activityCount":I
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 687
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 689
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 690
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 691
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 693
a=0;//     :cond_1
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public getDataModel()Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 810
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 787
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHistorySize()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 802
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getHistorySize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 697
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 698
a=0;//     .local v0, "itemViewType":I
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 707
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 700
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 705
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 702
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 703
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     .line 705
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v1, p1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 698
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 712
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemViewType(I)I
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 671
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 672
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 674
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getMaxActivityCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 806
a=0;//     iget v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getShowDefaultActivity()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 824
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 10
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 716
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 717
a=0;//     .local v3, "itemViewType":I
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     .line 751
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v6}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 719
a=0;//     :pswitch_0
a=0;//     #v6=(Uninit);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v6, v9, :cond_1
a=0;// 
a=0;//     .line 720
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 721
a=0;//     sget v7, Lcom/actionbarsherlock/R$layout;->abs__activity_chooser_view_list_item:I
a=0;// 
a=0;//     .line 720
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7, p3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 722
a=0;//     invoke-virtual {p2, v9}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     .line 723
a=0;//     sget v6, Lcom/actionbarsherlock/R$id;->abs__title:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 724
a=0;//     .local v5, "titleView":Landroid/widget/TextView;
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v6}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$4(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 725
a=0;//     sget v7, Lcom/actionbarsherlock/R$string;->abs__activity_chooser_view_see_all:I
a=0;// 
a=0;//     .line 724
a=0;//     invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .end local v5    # "titleView":Landroid/widget/TextView;
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     .line 749
a=0;//     .end local p2    # "convertView":Landroid/view/View;
a=0;//     .local v1, "convertView":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/view/View;);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 729
a=0;//     .end local v1    # "convertView":Landroid/view/View;
a=0;//     .restart local p2    # "convertView":Landroid/view/View;
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__list_item:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eq v6, v7, :cond_3
a=0;// 
a=0;//     .line 730
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 731
a=0;//     sget v7, Lcom/actionbarsherlock/R$layout;->abs__activity_chooser_view_list_item:I
a=0;// 
a=0;//     .line 730
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7, p3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 733
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v6}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$4(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 735
a=0;//     .local v4, "packageManager":Landroid/content/pm/PackageManager;
a=0;//     #v4=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     sget v6, Lcom/actionbarsherlock/R$id;->abs__icon:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 736
a=0;//     .local v2, "iconView":Landroid/widget/ImageView;
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 737
a=0;//     .local v0, "activity":Landroid/content/pm/ResolveInfo;
a=0;//     invoke-virtual {v0, v4}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 739
a=0;//     sget v6, Lcom/actionbarsherlock/R$id;->abs__title:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 740
a=0;//     .restart local v5    # "titleView":Landroid/widget/TextView;
a=0;//     invoke-virtual {v0, v4}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 741
a=0;//     invoke-static {}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$11()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 743
a=0;//     iget-boolean v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     if-nez p1, :cond_5
a=0;// 
a=0;//     iget-boolean v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mHighlightDefaultActivity:Z
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 744
a=0;//     invoke-static {p2, v9}, Lcom/actionbarsherlock/widget/ActivityChooserView$SetActivated;->invoke(Landroid/view/View;Z)V
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     move-object v1, p2
a=0;// 
a=0;//     .line 749
a=0;//     .end local p2    # "convertView":Landroid/view/View;
a=0;//     .restart local v1    # "convertView":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 746
a=0;//     .end local v1    # "convertView":Landroid/view/View;
a=0;//     .restart local p2    # "convertView":Landroid/view/View;
a=0;//     :cond_5
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p2, v8}, Lcom/actionbarsherlock/widget/ActivityChooserView$SetActivated;->invoke(Landroid/view/View;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 717
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getViewTypeCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 680
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public measureContentWidth()I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 758
a=0;//     #v8=(Null);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     .line 759
a=0;//     .local v5, "oldMaxActivityCount":I
a=0;//     #v5=(Integer);
a=0;//     const v7, 0x7fffffff
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     .line 761
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 762
a=0;//     .local v0, "contentWidth":I
a=0;//     #v0=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 764
a=0;//     .local v4, "itemView":Landroid/view/View;
a=0;//     #v4=(Null);
a=0;//     invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 765
a=0;//     .local v6, "widthMeasureSpec":I
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 766
a=0;//     .local v2, "heightMeasureSpec":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 768
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Integer);v4=(Reference,Landroid/view/View;);
a=0;//     if-lt v3, v1, :cond_0
a=0;// 
a=0;//     .line 774
a=0;//     iput v5, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     .line 776
a=0;//     return v0
a=0;// 
a=0;//     .line 769
a=0;//     :cond_0
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {p0, v3, v4, v7}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 770
a=0;//     invoke-virtual {v4, v6, v2}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 771
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 768
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDataModel(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;//     .locals 2
a=0;//     .param p1, "dataModel"    # Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 654
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserView;)Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 655
a=0;//     .local v0, "oldDataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->isShown()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 657
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$10(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/database/DataSetObserver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->unregisterObserver(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 662
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     .line 663
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->isShown()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 664
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->access$10(Lcom/actionbarsherlock/widget/ActivityChooserView;)Landroid/database/DataSetObserver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->registerObserver(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 666
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 667
a=0;//     return-void
a=0;// 
a=0;//     .line 658
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setMaxActivityCount(I)V
a=0;//     .locals 1
a=0;//     .param p1, "maxActivityCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 780
a=0;//     iget v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 781
a=0;//     iput p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I
a=0;// 
a=0;//     .line 782
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 784
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowDefaultActivity(ZZ)V
a=0;//     .locals 1
a=0;//     .param p1, "showDefaultActivity"    # Z
a=0;//     .param p2, "highlightDefaultActivity"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 815
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 816
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mHighlightDefaultActivity:Z
a=0;// 
a=0;//     if-eq v0, p2, :cond_1
a=0;// 
a=0;//     .line 817
a=0;//     :cond_0
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z
a=0;// 
a=0;//     .line 818
a=0;//     iput-boolean p2, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mHighlightDefaultActivity:Z
a=0;// 
a=0;//     .line 819
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 821
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowFooterView(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "showFooterView"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 792
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z
a=0;// 
a=0;//     .line 793
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 795
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
