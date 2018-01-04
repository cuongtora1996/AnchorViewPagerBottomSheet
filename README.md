# AnchorViewPagerBottomSheet
NO WORK HERE. I just combine 2 lib into 1. This lib is about BottomSheetBehaviour which can Anchor in 1 point and use mutiple ViewPager. The easy example is that I want a BottomSheetBehaviour like GoogleMap BottomSheet. I put 2 link lib in the end.
# How to use
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency:
```
dependencies {
		compile 'com.github.cuongtora1996:AnchorViewPagerBottomSheet:1.0'
	}
```
Use `AnchorViewPagerBottomSheet` for your bottom sheet view:
```
app:layout_behavior="@string/avpbs_bottom_sheet_behavior"
```
Setup any nested `ViewPager` inside the bottom sheet:
```
BottomSheetUtils.setupViewPager(bottomSheetViewPager)
```
Use `STATE_ANCHOR` if you want to anchor your bottom sheet view:
```
bottomSheetBehavior.setState(AnchorViewPagerBottomSheet.STATE_ANCHOR);
```

# Reference Library
**ViewPagerBottomSheet**: [Here](https://github.com/laenger/ViewPagerBottomSheet)

**AnchorSheetBehavior**: [Here](https://github.com/skimarxall/AnchorSheetBehavior)
