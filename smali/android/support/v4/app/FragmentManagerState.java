package android.support.v4.app; class FragmentManagerState { void a() { int a;
a=0;// .class final Landroid/support/v4/app/FragmentManagerState;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FragmentManager.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/FragmentManagerState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;// .field mAdded:[I
a=0;// 
a=0;// .field mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerState$1;);
a=0;//     sput-object v0, Landroid/support/v4/app/FragmentManagerState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 344
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentManagerState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 347
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentManagerState;);
a=0;//     sget-object v0, Landroid/support/v4/app/FragmentState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     .line 349
a=0;//     sget-object v0, Landroid/support/v4/app/BackStackState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     .line 350
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;//     .param p1, "dest"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V
a=0;// 
a=0;//     .line 359
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
a=0;// 
a=0;//     .line 360
a=0;//     return-void
a=0;// .end method
}}
