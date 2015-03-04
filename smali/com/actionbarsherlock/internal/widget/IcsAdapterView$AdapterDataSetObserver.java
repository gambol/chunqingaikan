package com.actionbarsherlock.internal.widget; class IcsAdapterView$AdapterDataSetObserver { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;
a=0;// .super Landroid/database/DataSetObserver;
a=0;// .source "IcsAdapterView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "AdapterDataSetObserver"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 760
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V
a=0;// 
a=0;//     .line 762
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearSavedState()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 807
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 808
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 766
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDataChanged:Z
a=0;// 
a=0;//     .line 767
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iget v1, v1, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldItemCount:I
a=0;// 
a=0;//     .line 768
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     .line 772
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 773
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 774
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->access$0(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 775
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 779
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->checkFocus()V
a=0;// 
a=0;//     .line 780
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->requestLayout()V
a=0;// 
a=0;//     .line 781
a=0;//     return-void
a=0;// 
a=0;//     .line 777
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->rememberSyncState()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInvalidated()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/high16 v4, -0x8000000000000000L
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 785
a=0;//     #v2=(Byte);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDataChanged:Z
a=0;// 
a=0;//     .line 787
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 790
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->access$1(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 794
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iget v1, v1, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldItemCount:I
a=0;// 
a=0;//     .line 795
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iput v3, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     .line 796
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iput v2, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     .line 797
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iput-wide v4, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     .line 798
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iput v2, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 799
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iput-wide v4, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 800
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     iput-boolean v3, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     .line 802
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->checkFocus()V
a=0;// 
a=0;//     .line 803
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->requestLayout()V
a=0;// 
a=0;//     .line 804
a=0;//     return-void
a=0;// .end method
}}
