package com.actionbarsherlock.internal.widget; class IcsAdapterView { void a() { int a;
a=0;// .class public abstract Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "IcsAdapterView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterContextMenuInfo;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T::",
a=0;//         "Landroid/widget/Adapter;",
a=0;//         ">",
a=0;//         "Landroid/view/ViewGroup;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final INVALID_POSITION:I = -0x1
a=0;// 
a=0;// .field public static final INVALID_ROW_ID:J = -0x8000000000000000L
a=0;// 
a=0;// .field public static final ITEM_VIEW_TYPE_HEADER_OR_FOOTER:I = -0x2
a=0;// 
a=0;// .field public static final ITEM_VIEW_TYPE_IGNORE:I = -0x1
a=0;// 
a=0;// .field static final SYNC_FIRST_POSITION:I = 0x1
a=0;// 
a=0;// .field static final SYNC_MAX_DURATION_MILLIS:I = 0x64
a=0;// 
a=0;// .field static final SYNC_SELECTED_POSITION:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mBlockLayoutRequests:Z
a=0;// 
a=0;// .field mDataChanged:Z
a=0;// 
a=0;// .field private mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;// .field private mDesiredFocusableState:Z
a=0;// 
a=0;// .field private mEmptyView:Landroid/view/View;
a=0;// 
a=0;// .field mFirstPosition:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "scrolling"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mInLayout:Z
a=0;// 
a=0;// .field mItemCount:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "list"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mLayoutHeight:I
a=0;// 
a=0;// .field mNeedSync:Z
a=0;// 
a=0;// .field mNextSelectedPosition:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "list"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mNextSelectedRowId:J
a=0;// 
a=0;// .field mOldItemCount:I
a=0;// 
a=0;// .field mOldSelectedPosition:I
a=0;// 
a=0;// .field mOldSelectedRowId:J
a=0;// 
a=0;// .field mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// .field mOnItemLongClickListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;
a=0;// 
a=0;// .field mOnItemSelectedListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;// .field mSelectedPosition:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "list"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mSelectedRowId:J
a=0;// 
a=0;// .field private mSelectionNotifier:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/actionbarsherlock/internal/widget/IcsAdapterView",
a=0;//             "<TT;>.SelectionNotifier;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mSpecificTop:I
a=0;// 
a=0;// .field mSyncHeight:J
a=0;// 
a=0;// .field mSyncMode:I
a=0;// 
a=0;// .field mSyncPosition:I
a=0;// 
a=0;// .field mSyncRowId:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 68
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     .line 84
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     .line 94
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     .line 126
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mInLayout:Z
a=0;// 
a=0;//     .line 153
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 158
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 164
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     .line 169
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     .line 201
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 206
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 225
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 232
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 68
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     .line 84
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     .line 94
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     .line 126
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mInLayout:Z
a=0;// 
a=0;//     .line 153
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 158
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 164
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     .line 169
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     .line 201
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 206
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 225
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 236
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 68
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     .line 84
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     .line 94
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     .line 126
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mInLayout:Z
a=0;// 
a=0;//     .line 153
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 158
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 164
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     .line 169
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     .line 201
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 206
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 225
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 237
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)Landroid/os/Parcelable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 854
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->fireOnSelected()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private fireOnSelected()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 855
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemSelectedListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 866
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 858
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 859
a=0;//     .local v3, "selection":I
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_1
a=0;// 
a=0;//     .line 860
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 861
a=0;//     .local v2, "v":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemSelectedListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     .line 862
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Adapter;);
a=0;//     invoke-interface {v1, v3}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 861
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;->onItemSelected(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;Landroid/view/View;IJ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 864
a=0;//     .end local v2    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemSelectedListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;->onNothingSelected(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isScrollableForAccessibility()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 917
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 918
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 919
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 920
a=0;//     .local v1, "itemCount":I
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 921
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v4, v1, -0x1
a=0;// 
a=0;//     .line 920
a=0;//     #v4=(Integer);
a=0;//     if-ge v3, v4, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 923
a=0;//     .end local v1    # "itemCount":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method private updateEmptyStatus(Z)V
a=0;//     .locals 6
a=0;//     .param p1, "empty"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 697
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 698
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 701
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 702
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 703
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 704
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->setVisibility(I)V
a=0;// 
a=0;//     .line 713
a=0;//     :goto_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDataChanged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 714
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 720
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 707
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 717
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 718
a=0;//     :cond_4
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addView(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;I)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 438
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View, int) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;//     .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View, int, LayoutParams) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View, LayoutParams) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected canAnimate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 928
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->canAnimate()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
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
a=0;// .method checkFocus()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 678
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 679
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 680
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 684
a=0;//     .local v2, "focusable":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 685
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDesiredFocusableState:Z
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V
a=0;// 
a=0;//     .line 686
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 687
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     :goto_4
a=0;//     #v3=(Conflicted);v5=(Boolean);
a=0;//     invoke-direct {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->updateEmptyStatus(Z)V
a=0;// 
a=0;//     .line 689
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "empty":Z
a=0;//     .end local v2    # "focusable":Z
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Null);
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 679
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "empty":Z
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 680
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v2    # "focusable":Z
a=0;//     :cond_3
a=0;//     #v2=(Boolean);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 684
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 685
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     move v5, v4
a=0;// 
a=0;//     .line 687
a=0;//     #v5=(One);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method checkSelectionChanged()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 995
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedRowId:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 996
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->selectionChanged()V
a=0;// 
a=0;//     .line 997
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 998
a=0;//     iget-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 1000
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 870
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 871
a=0;//     .local v0, "selectedView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 872
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 873
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 875
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 757
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 758
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 749
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 750
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method findSyncPosition()I
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 1011
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iget v2, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     .line 1013
a=0;//     .local v2, "count":I
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1014
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     .line 1086
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Integer);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     return v14
a=0;// 
a=0;//     .line 1017
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v8, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     .line 1018
a=0;//     .local v8, "idToMatch":J
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v14, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncPosition:I
a=0;// 
a=0;//     .line 1021
a=0;//     .local v14, "seed":I
a=0;//     #v14=(Integer);
a=0;//     const-wide/high16 v15, -0x8000000000000000L
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     cmp-long v15, v8, v15
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-nez v15, :cond_2
a=0;// 
a=0;//     .line 1022
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1026
a=0;//     :cond_2
a=0;//     #v14=(Integer);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1027
a=0;//     add-int/lit8 v15, v2, -0x1
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1029
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     const-wide/16 v17, 0x64
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     add-long v3, v15, v17
a=0;// 
a=0;//     .line 1034
a=0;//     .local v3, "endTime":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move v5, v14
a=0;// 
a=0;//     .line 1037
a=0;//     .local v5, "first":I
a=0;//     #v5=(Integer);
a=0;//     move v10, v14
a=0;// 
a=0;//     .line 1040
a=0;//     .local v10, "last":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1050
a=0;//     .local v11, "next":Z
a=0;//     #v11=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1051
a=0;//     .local v1, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v1=(Reference,Landroid/widget/Adapter;);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 1052
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1056
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);v7=(Conflicted);v11=(Boolean);v12=(Conflicted);v13=(Conflicted);v14=(Integer);v15=(Byte);
a=0;//     invoke-interface {v1, v14}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     .line 1057
a=0;//     .local v12, "rowId":J
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v15, v12, v8
a=0;// 
a=0;//     if-eqz v15, :cond_0
a=0;// 
a=0;//     .line 1062
a=0;//     add-int/lit8 v15, v2, -0x1
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-ne v10, v15, :cond_4
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1063
a=0;//     .local v7, "hitLast":Z
a=0;//     :goto_1
a=0;//     #v7=(Boolean);
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 1065
a=0;//     .local v6, "hitFirst":Z
a=0;//     :goto_2
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 1086
a=0;//     .end local v6    # "hitFirst":Z
a=0;//     .end local v7    # "hitLast":Z
a=0;//     .end local v12    # "rowId":J
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1062
a=0;//     .restart local v12    # "rowId":J
a=0;//     :cond_4
a=0;//     #v12=(LongLo);v13=(LongHi);v14=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1063
a=0;//     .restart local v7    # "hitLast":Z
a=0;//     :cond_5
a=0;//     #v7=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1070
a=0;//     .restart local v6    # "hitFirst":Z
a=0;//     :cond_6
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     if-eqz v11, :cond_9
a=0;// 
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 1072
a=0;//     :cond_7
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     .line 1073
a=0;//     move v14, v10
a=0;// 
a=0;//     .line 1075
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1055
a=0;//     .end local v6    # "hitFirst":Z
a=0;//     .end local v7    # "hitLast":Z
a=0;//     .end local v12    # "rowId":J
a=0;//     :cond_8
a=0;//     :goto_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     cmp-long v15, v15, v3
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-lez v15, :cond_3
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1076
a=0;//     .restart local v6    # "hitFirst":Z
a=0;//     .restart local v7    # "hitLast":Z
a=0;//     .restart local v12    # "rowId":J
a=0;//     :cond_9
a=0;//     #v6=(Boolean);v7=(Boolean);v12=(LongLo);v13=(LongHi);v15=(Integer);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     if-nez v11, :cond_8
a=0;// 
a=0;//     if-nez v6, :cond_8
a=0;// 
a=0;//     .line 1078
a=0;//     :cond_a
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     .line 1079
a=0;//     move v14, v5
a=0;// 
a=0;//     .line 1081
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public abstract getAdapter()Landroid/widget/Adapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 555
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getEmptyView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 638
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFirstVisiblePosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemAtPosition(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 729
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 730
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-gez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemIdAtPosition(I)J
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 734
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 735
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-gez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getLastVisiblePosition()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 608
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getOnItemLongClickListener()Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemLongClickListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getOnItemSelectedListener()Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemSelectedListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPositionForView(Landroid/view/View;)I
a=0;//     .locals 7
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 568
a=0;//     #v5=(Byte);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     .line 571
a=0;//     .local v3, "listItem":Landroid/view/View;
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/view/View;);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v4, Landroid/view/View;
a=0;// 
a=0;//     .local v4, "v":Landroid/view/View;
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 580
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 581
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     if-lt v2, v0, :cond_1
a=0;// 
a=0;//     .line 588
a=0;//     .end local v0    # "childCount":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "v":Landroid/view/View;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 572
a=0;//     .restart local v4    # "v":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Reference,Landroid/view/View;);v5=(Byte);v6=(Boolean);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 574
a=0;//     .end local v4    # "v":Landroid/view/View;
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 576
a=0;//     .local v1, "e":Ljava/lang/ClassCastException;
a=0;//     #v1=(Reference,Ljava/lang/ClassCastException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 582
a=0;//     .end local v1    # "e":Ljava/lang/ClassCastException;
a=0;//     .restart local v0    # "childCount":I
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v4    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);v4=(Reference,Landroid/view/View;);v6=(Boolean);
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 583
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 581
a=0;//     :cond_2
a=0;//     #v5=(Byte);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItem()Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 540
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 541
a=0;//     .local v1, "selection":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 542
a=0;//     invoke-interface {v0, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 544
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemId()J
a=0;//     .locals 2
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 525
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemPosition()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 516
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract getSelectedView()Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method handleDataChanged()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const-wide/high16 v8, -0x8000000000000000L
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 932
a=0;//     #v5=(Null);
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mItemCount:I
a=0;// 
a=0;//     .line 933
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 935
a=0;//     .local v1, "found":Z
a=0;//     #v1=(Null);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     .line 940
a=0;//     iget-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 943
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     .line 947
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->findSyncPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 948
a=0;//     .local v2, "newPos":I
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     .line 950
a=0;//     invoke-virtual {p0, v2, v7}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->lookForSelectablePosition(IZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 951
a=0;//     .local v3, "selectablePos":I
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     .line 953
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 954
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 958
a=0;//     .end local v2    # "newPos":I
a=0;//     .end local v3    # "selectablePos":I
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 960
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 963
a=0;//     .restart local v2    # "newPos":I
a=0;//     #v2=(Integer);
a=0;//     if-lt v2, v0, :cond_1
a=0;// 
a=0;//     .line 964
a=0;//     add-int/lit8 v2, v0, -0x1
a=0;// 
a=0;//     .line 966
a=0;//     :cond_1
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     .line 967
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 971
a=0;//     :cond_2
a=0;//     invoke-virtual {p0, v2, v7}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->lookForSelectablePosition(IZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 972
a=0;//     .restart local v3    # "selectablePos":I
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_3
a=0;// 
a=0;//     .line 974
a=0;//     invoke-virtual {p0, v2, v5}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->lookForSelectablePosition(IZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 976
a=0;//     :cond_3
a=0;//     if-ltz v3, :cond_4
a=0;// 
a=0;//     .line 977
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 978
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->checkSelectionChanged()V
a=0;// 
a=0;//     .line 979
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 983
a=0;//     .end local v2    # "newPos":I
a=0;//     .end local v3    # "selectablePos":I
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 985
a=0;//     iput v6, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     .line 986
a=0;//     iput-wide v8, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     .line 987
a=0;//     iput v6, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 988
a=0;//     iput-wide v8, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 989
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     .line 990
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->checkSelectionChanged()V
a=0;// 
a=0;//     .line 992
a=0;//     :cond_5
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method isInFilterMode()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 648
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method lookForSelectablePosition(IZ)I
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "lookDown"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1098
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 813
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 814
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectionNotifier:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 815
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 904
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 905
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isScrollableForAccessibility()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V
a=0;// 
a=0;//     .line 906
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 907
a=0;//     .local v0, "selectedView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 908
a=0;//     invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setEnabled(Z)V
a=0;// 
a=0;//     .line 910
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setCurrentItemIndex(I)V
a=0;// 
a=0;//     .line 911
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V
a=0;// 
a=0;//     .line 912
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V
a=0;// 
a=0;//     .line 913
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V
a=0;// 
a=0;//     .line 914
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
a=0;//     .locals 2
a=0;//     .param p1, "info"    # Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 894
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
a=0;// 
a=0;//     .line 895
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isScrollableForAccessibility()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V
a=0;// 
a=0;//     .line 896
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getSelectedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 897
a=0;//     .local v0, "selectedView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 898
a=0;//     invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V
a=0;// 
a=0;//     .line 900
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 1
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mLayoutHeight:I
a=0;// 
a=0;//     .line 507
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRequestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 880
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 882
a=0;//     invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 883
a=0;//     .local v0, "record":Landroid/view/accessibility/AccessibilityEvent;
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityEvent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 885
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     .line 886
a=0;//     invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->appendRecord(Landroid/view/accessibility/AccessibilityRecord;)V
a=0;// 
a=0;//     .line 887
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 889
a=0;//     .end local v0    # "record":Landroid/view/accessibility/AccessibilityEvent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public performItemClick(Landroid/view/View;IJ)Z
a=0;//     .locals 7
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "position"    # I
a=0;//     .param p3, "id"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 268
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 269
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p1, v6}, Landroid/view/View;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 272
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-wide v4, p3
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 276
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method rememberSyncState()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1131
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 1132
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     .line 1133
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mLayoutHeight:I
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncHeight:J
a=0;// 
a=0;//     .line 1134
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     .line 1136
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1137
a=0;//     .local v1, "v":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-wide v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     .line 1138
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncPosition:I
a=0;// 
a=0;//     .line 1139
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1140
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSpecificTop:I
a=0;// 
a=0;//     .line 1142
a=0;//     :cond_0
a=0;//     iput v4, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncMode:I
a=0;// 
a=0;//     .line 1159
a=0;//     .end local v1    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1145
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(LongHi);
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1146
a=0;//     .restart local v1    # "v":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1147
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     if-ltz v2, :cond_4
a=0;// 
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_4
a=0;// 
a=0;//     .line 1148
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     .line 1152
a=0;//     :goto_1
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mFirstPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncPosition:I
a=0;// 
a=0;//     .line 1153
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1154
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSpecificTop:I
a=0;// 
a=0;//     .line 1156
a=0;//     :cond_3
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncMode:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1150
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeAllViews()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "removeAllViews() is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public removeView(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "removeView(View) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public removeViewAt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 491
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "removeViewAt(int) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method selectionChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 833
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemSelectedListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 834
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 839
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectionNotifier:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 840
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;-><init>(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectionNotifier:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;// 
a=0;//     .line 842
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectionNotifier:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 849
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 850
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 852
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 844
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->fireOnSelected()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract setAdapter(Landroid/widget/Adapter;)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public setEmptyView(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "emptyView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 623
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 625
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 626
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 627
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->updateEmptyStatus(Z)V
a=0;// 
a=0;//     .line 628
a=0;//     return-void
a=0;// 
a=0;//     .line 626
a=0;//     .end local v1    # "empty":Z
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setFocusable(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "focusable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 653
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 654
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 656
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v4=(Conflicted);
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDesiredFocusableState:Z
a=0;// 
a=0;//     .line 657
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 658
a=0;//     iput-boolean v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;//     .line 661
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V
a=0;// 
a=0;//     .line 662
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "empty":Z
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(One);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 654
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "empty":Z
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 661
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setFocusableInTouchMode(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "focusable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 666
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 667
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 669
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v4=(Conflicted);
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;//     .line 670
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 671
a=0;//     iput-boolean v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDesiredFocusableState:Z
a=0;// 
a=0;//     .line 674
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 675
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "empty":Z
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(One);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 667
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "empty":Z
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 674
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setNextSelectedPositionInt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1116
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 1117
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getItemIdAtPosition(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 1119
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNeedSync:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     .line 1120
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncPosition:I
a=0;// 
a=0;//     .line 1121
a=0;//     iget-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mNextSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSyncRowId:J
a=0;// 
a=0;//     .line 1123
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p1, "l"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 740
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "Don\'t call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     .local p1, "listener":Landroid/widget/AdapterView$OnItemClickListener;, "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .line 247
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemLongClickListener(Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     .local p1, "listener":Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;"
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->isLongClickable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 310
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->setLongClickable(Z)V
a=0;// 
a=0;//     .line 312
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemLongClickListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemLongClickListener;
a=0;// 
a=0;//     .line 313
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemSelectedListener(Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     .local p1, "listener":Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;"
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mOnItemSelectedListener:Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     .line 363
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSelectedPositionInt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1106
a=0;//     .local p0, "this":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<TT;>;"
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedPosition:I
a=0;// 
a=0;//     .line 1107
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getItemIdAtPosition(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mSelectedRowId:J
a=0;// 
a=0;//     .line 1108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract setSelection(I)V
a=0;// .end method
}}
